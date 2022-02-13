package com.example.jokesapp.data.remote

import com.example.jokesapp.models.QuizResponse
import retrofit2.http.GET
import retrofit2.http.Query

enum class Difficulty {
    easy,
    medium,
    hard
}

interface  OpenTDBApi {
    @GET("api.php")
    suspend fun getQuizResponse(
        @Query(value = "amount") amount: Int = 10,
        @Query(value = "category") category: Int = 21,
        @Query(value = "difficulty") difficulty: Difficulty = Difficulty.easy,
        @Query(value = "type") type: String = "multiple",
    ): QuizResponse
}