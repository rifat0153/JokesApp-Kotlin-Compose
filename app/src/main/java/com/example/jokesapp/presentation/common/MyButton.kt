package com.example.jokesapp.presentation.common

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.jokesapp.ui.theme.kPadding

@Composable
fun MyButton(
    text: String,
    onClick: () -> Unit,
    backgroundColor: Color = com.example.jokesapp.ui.theme.Button,
    height: Int = 8,
    width: Int = 35,
    cornerRadius: Int = 30,
    textColor: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Bold,
    textStyle: TextStyle = MaterialTheme.typography.h5,

    ) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor
        ),
        shape = RoundedCornerShape(cornerRadius),
        modifier = Modifier
            .height(kPadding * height)
            .width(kPadding * width)
    ) {
        Text(
            text = text,
            style = textStyle,
            color = textColor,
            fontWeight = fontWeight
        )
    }

}

@Composable
fun MyOutlinedButton(
    text: String,
    onClick: () -> Unit,
    backgroundColor: Color = Color.Transparent,
    height: Int = 8,
    width: Int = 35,
    cornerRadius: Int = 30,
    textColor: Color = com.example.jokesapp.ui.theme.Button,
    fontWeight: FontWeight = FontWeight.Bold,
    textStyle: TextStyle = MaterialTheme.typography.h5,
) {
    OutlinedButton(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(backgroundColor),
        border = BorderStroke(1.dp, com.example.jokesapp.ui.theme.Button),
        shape = RoundedCornerShape(cornerRadius),
        modifier = Modifier
            .height(kPadding * height)
            .width(kPadding * width)
    ) {
        Text(
            text = text,
            style = textStyle,
            color = textColor,
            fontWeight = fontWeight
        )
    }

}