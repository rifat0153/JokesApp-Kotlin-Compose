package com.example.jokesapp.presentation


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.jokesapp.presentation.home.HomeState
import com.example.jokesapp.presentation.home.HomeViewModel
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun QuizScreen(
    viewModel: HomeViewModel = hiltViewModel(),

) {

    val state = viewModel.state.value

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Quiz List Screen")

        Button(
            onClick = {

            }
        ) {
            Text(text = "Goto Quiz Screen")
        }

        when (state) {
            is HomeState.Loading -> Text(text = "Loading")
            is HomeState.Error -> Text(text = state.error)
            is HomeState.Success -> {
                Text(text = state.questions.size.toString())
            }
        }
    }

}


