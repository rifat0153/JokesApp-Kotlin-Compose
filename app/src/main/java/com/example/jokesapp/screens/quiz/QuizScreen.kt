package com.example.jokesapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jokesapp.screens.home.HomeState
import com.example.jokesapp.screens.home.HomeViewModel

@Composable
fun QuizScreen(
    viewModel: HomeViewModel,
    navController: NavController
) {

    val state = viewModel.state.value

    Column(modifier = Modifier.padding(horizontal = 8.dp)) {
        Text(text = "Quiz List Screen")

        Button(
            onClick = {
                navController.navigateUp()
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


