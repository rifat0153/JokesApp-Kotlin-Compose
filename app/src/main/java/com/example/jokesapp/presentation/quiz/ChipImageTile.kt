package com.example.jokesapp.presentation.quiz

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jokesapp.R
import com.example.jokesapp.ui.theme.kPadding
import com.example.jokesapp.ui.theme.kRadius
import kotlinx.coroutines.delay

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

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun ChipTilePreview() {
    ChipImageTile(
        background = Color.Magenta,
        title = "Science",
        subTitle = "Level 2",
        iconImage = painterResource(R.drawable.air_hot_balloon),
        animationDelay = 300L
    )
}