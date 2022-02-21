package com.example.jokesapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

//@Destination
@Composable
fun QuizDetailScreen(
    name: String = ""
) {

    Column() {
        Text(text = "Quiz Detail Screen $name")

        Button(
            onClick = {
//                navigator.navigateUp()
            }
        ) {
            Text(text = "Goto Quiz Screen")
        }
    }

}
