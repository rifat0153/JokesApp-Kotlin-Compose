package com.example.jokesapp.presentation.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.example.jokesapp.presentation.common.MyButton
import com.example.jokesapp.presentation.common.MyOutlinedButton
import com.example.jokesapp.presentation.destinations.MenuScreenDestination
import com.example.jokesapp.ui.theme.kPadding
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(start = true)
@Composable
fun HomeScreen(
    navController: DestinationsNavigator
) {

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "HomeScreen", style = TextStyle(color = Color.Black))

        MyButton(text = "Play now", onClick = {
            navController.navigate(MenuScreenDestination)
        })

        Spacer(modifier = Modifier.height(kPadding * 4))

        MyOutlinedButton(
            text = "About",
            onClick = {

            },
        )
    }


}

