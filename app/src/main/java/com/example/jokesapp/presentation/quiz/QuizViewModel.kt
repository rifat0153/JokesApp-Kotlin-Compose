package com.example.jokesapp.presentation.quiz

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.jokesapp.data.repository.QuizRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuizViewModel @Inject constructor(
    private  val quizRepository: QuizRepository,
    savedStateHandle: SavedStateHandle
): ViewModel() {

    private val _id: String? = savedStateHandle["categoryId"]
    val id = _id

    init {
        Log.d("QuizViewModel", _id.toString())
    }

}