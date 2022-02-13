package com.example.jokesapp.screens

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.jokesapp.screens.destinations.QuizDetailScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun QuizScreen(
    navigator: DestinationsNavigator
) {

    Text(text = "Quiz Screen")

    Button(
        onClick = {
            navigator.navigate(QuizDetailScreenDestination(name = "HAHA"))
        }
    ) {
        Text(text = "Goto Quiz Screen")
    }
    
}


