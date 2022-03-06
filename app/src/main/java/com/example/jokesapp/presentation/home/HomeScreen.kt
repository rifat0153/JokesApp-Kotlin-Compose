package com.example.jokesapp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jokesapp.presentation.common.MyButton
import com.example.jokesapp.presentation.common.MyOutlinedButton
import com.example.jokesapp.presentation.destinations.QuizScreenDestination
import com.example.jokesapp.ui.theme.kPadding
import com.example.jokesapp.ui.theme.kRadius
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(start = true)
@Composable
fun HomeScreen(
    navController: DestinationsNavigator
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        ChipImageTile()

        Text(text = "HomeScreen")

        MyButton(text = "Play now", onClick = {
            navController.navigate(QuizScreenDestination)
        })

        Spacer(modifier = Modifier.height(kPadding * 4))

        MyOutlinedButton(
            text = "About",
            onClick = {

            },
        )
    }


}

@Composable
fun ChipImageTile(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(kPadding * 2)
            .clip(shape = RoundedCornerShape(kRadius * 2))
            .background(Color.Magenta)
    ) {
        Column(modifier = Modifier.padding(kPadding * 2)) {
            Icon(
                imageVector = Icons.Filled.PlayArrow, contentDescription = "icon",
                modifier = Modifier.size(30.dp)
            )
            Text(text = "level 2")
            Text(
                text = "Science", style = TextStyle(
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )
        }
    }
}