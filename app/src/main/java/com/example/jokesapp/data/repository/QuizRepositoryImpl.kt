package com.example.jokesapp.data.repository

import com.example.jokesapp.data.remote.OpenTDBApi
import com.example.jokesapp.models.QuizResponse
import javax.inject.Inject

class QuizRepositoryImpl @Inject constructor (
    private val api: OpenTDBApi
) : QuizRepository {
    override suspend fun getQuestions(): QuizResponse {
        return api.getQuizResponse()
    }
}