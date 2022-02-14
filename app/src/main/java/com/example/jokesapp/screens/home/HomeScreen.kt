package com.example.jokesapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.jokesapp.screens.common.MyButton
import com.example.jokesapp.screens.common.MyOutlinedButton
import com.example.jokesapp.screens.destinations.QuizScreenDestination
import com.example.jokesapp.ui.theme.kPadding
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(start = true)
@Composable
fun HomeScreen(
    navigator: DestinationsNavigator,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Text(text = "HomeScreen")

        MyButton(text = "Play now", onClick = {
            navigator.navigate(QuizScreenDestination)
        })
        
        Spacer(modifier = Modifier.height(kPadding * 4))

        MyOutlinedButton(
            text = "About", onClick = {
                navigator.navigate(QuizScreenDestination)
            },
            textColor = MaterialTheme.colors.primary
        )

    }
}