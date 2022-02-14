package com.example.jokesapp.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jokesapp.R
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
            .background(color = MaterialTheme.colors.background)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Image(
            painterResource(R.drawable.ic_homescreen_img),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(1000.dp)
        )

        
        Text(text = "HomeScreen")

        MyButton(text = "Play now", onClick = {
            navigator.navigate(QuizScreenDestination)
        })
        
        Spacer(modifier = Modifier.height(kPadding * 4))

        MyOutlinedButton(
            text = "About", onClick = {
                navigator.navigate(QuizScreenDestination)
            },
        )

    }
}