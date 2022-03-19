package com.example.jokesapp.presentation.quiz


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.jokesapp.R
import com.example.jokesapp.data.remote.Difficulty
import com.example.jokesapp.presentation.home.HomeState
import com.example.jokesapp.presentation.home.HomeViewModel
import com.ramcosta.composedestinations.annotation.Destination

data class QuizScreenNavArgs(
    val categoryId: String,
    val difficulty: Difficulty
)

@Destination(
    navArgsDelegate = QuizScreenNavArgs::class
)
@Composable
fun QuizScreen(
    viewModel: QuizViewModel = hiltViewModel(),
) {

    val id = viewModel.id

    Column(modifier = Modifier.padding(16.dp)) {

       Text(text = id.toString())
    }

}


