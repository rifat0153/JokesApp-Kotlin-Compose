package com.example.jokesapp.presentation.home

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jokesapp.R
import com.example.jokesapp.presentation.common.MyButton
import com.example.jokesapp.presentation.common.MyOutlinedButton
import com.example.jokesapp.presentation.destinations.MenuScreenDestination
import com.example.jokesapp.presentation.destinations.QuizScreenDestination
import com.example.jokesapp.ui.theme.kPadding
import com.example.jokesapp.ui.theme.kRadius
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import kotlinx.coroutines.delay

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

