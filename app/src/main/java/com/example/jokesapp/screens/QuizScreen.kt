package com.example.jokesapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.jokesapp.screens.destinations.QuizDetailScreenDestination
import com.example.jokesapp.screens.home.HomeState
import com.example.jokesapp.screens.home.HomeViewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun QuizScreen(
    navigator: DestinationsNavigator,
    viewModel: HomeViewModel = hiltViewModel()
) {

    val state = viewModel.state.value

    Column(modifier = Modifier.padding(horizontal = 8.dp)) {
        Text(text = "Quiz List Screen")

        Button(
            onClick = {
                navigator.navigate(QuizDetailScreenDestination(name = "HAHA"))
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


