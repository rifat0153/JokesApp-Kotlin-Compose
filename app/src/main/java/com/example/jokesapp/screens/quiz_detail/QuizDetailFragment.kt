package com.example.jokesapp.screens.quiz_detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.jokesapp.screens.home.HomeState
import com.example.jokesapp.screens.home.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class QuizDetailFragment : Fragment() {

    private val viewModel: HomeViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                val state = viewModel.state.value

                when (state) {
                    is HomeState.Loading -> Text(text = "Loading")
                    is HomeState.Error -> Text(text = state.error)
                    is HomeState.Success -> {
                        Text(text = state.questions.size.toString())
                    }
                }
            }
        }
    }


}