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
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

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

        Text(text = "HomeScreen", style = TextStyle(color = Color.Black))

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
fun ChipImageTile(
    modifier: Modifier = Modifier,
    background: Color,
    title: String,
    subTitle: String,
    iconImage: Painter,
    animationDelay: Long
) {

    val startAnimation = remember { mutableStateOf(false) }
    val offsetX by animateDpAsState(
        targetValue = if (startAnimation.value) 0.dp else 500.dp,
        animationSpec = spring(dampingRatio = 5f)
    )

    LaunchedEffect(key1 = true) {
        delay(timeMillis = animationDelay)
        startAnimation.value = true
    }


    Box(
        Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(kPadding * 2)
            .offset(x = offsetX)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(kRadius * 2))
                .background(background)
                .align(Alignment.BottomCenter)
        ) {

            Column(
                modifier = Modifier
                    .padding(kPadding * 2)

            ) {
                Icon(
                    imageVector = Icons.Filled.PlayArrow, contentDescription = "icon",
                    modifier = Modifier.size(30.dp)
                )
                Text(text = subTitle)
                Text(
                    text = title, style = TextStyle(
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                )
            }

        }


        Image(
            painter = iconImage,
            contentDescription = "Icon Image",
            modifier = Modifier
                .height(120.dp)
                .width(120.dp)
                .padding(end = 16.dp)
                .align(Alignment.TopEnd)
        )
    }
}

//@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
//@Composable
//fun JokeImageTilePreview() {
//    ChipImageTile(
//        background = Color.Magenta,
//        title = "Science",
//        subTitle = "Level 2",
//        iconImage = painterResource(R.drawable.air_hot_balloon)
//    )
//}