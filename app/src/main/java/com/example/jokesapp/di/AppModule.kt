package com.example.jokesapp.di

import com.example.jokesapp.Constants
import com.example.jokesapp.data.repository.QuizRepository
import com.example.jokesapp.data.repository.QuizRepositoryImpl
import com.example.jokesapp.data.remote.OpenTDBApi
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideQuizApi(): OpenTDBApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(OpenTDBApi::class.java)
    }

    @Provides
    @Singleton
    fun provideQuizRepositoryImpl(api: OpenTDBApi): QuizRepository {
        return QuizRepositoryImpl(api = api)
    }

}