package com.example.jokesapp.data.repository

import com.example.jokesapp.models.QuizResponse

interface QuizRepository {
    suspend fun getQuestions() : QuizResponse
}