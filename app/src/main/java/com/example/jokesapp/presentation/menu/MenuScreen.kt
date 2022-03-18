package com.example.jokesapp.presentation.menu

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jokesapp.R
import com.example.jokesapp.presentation.home.HomeState
import com.example.jokesapp.presentation.quiz.ChipImageTile
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun MenuScreen(navigator: DestinationsNavigator) {
    Column(modifier = Modifier.padding(16.dp)) {

        ChipImageTile(
            background = Color.Magenta,
            title = "Science",
            subTitle = "Level 2",
            iconImage = painterResource(R.drawable.air_hot_balloon),
            animationDelay = 0L
        )

        ChipImageTile(
            background = Color.Green,
            title = "Earth",
            subTitle = "Level 4",
            iconImage = painterResource(R.drawable.earth),
            animationDelay = 100L
        )

        ChipImageTile(
            background = Color.Blue,
            title = "General",
            subTitle = "Level 4",
            iconImage = painterResource(R.drawable.books),
            animationDelay = 200L
        )
    }
}