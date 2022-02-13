package com.example.jokesapp.screens.home

import com.example.jokesapp.models.Question

sealed class HomeState {
    data class Success(val questions: List<Question> = emptyList()) : HomeState()
    class Error(val error: String): HomeState()
    object  Loading: HomeState()

}