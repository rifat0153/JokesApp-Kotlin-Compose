package com.example.jokesapp.presentation.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jokesapp.data.repository.QuizRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: QuizRepository
) : ViewModel() {

    private val _state = mutableStateOf<HomeState>(HomeState.Loading)
    val state: State<HomeState> = _state

    init {
        viewModelScope.launch {
            val result =   repository.getQuestions()
            _state.value = HomeState.Success(questions =  result.results)
        }
    }



}