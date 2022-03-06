package com.example.jokesapp.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun QuizDetailScreen(
    name: String = ""
) {

    Column() {
        Text(text = "Quiz Detail Screen $name")

        Button(
            onClick = {
            }
        ) {
            Text(text = "Goto Quiz Screen")
        }
    }

}
