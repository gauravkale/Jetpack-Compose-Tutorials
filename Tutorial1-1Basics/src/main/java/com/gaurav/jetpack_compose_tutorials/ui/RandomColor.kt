package com.gaurav.jetpack_compose_tutorials.ui

import androidx.compose.ui.graphics.Color
import kotlin.random.Random

fun getRandomColor() =  Color(
    red = Random.nextInt(256),
    green = Random.nextInt(256),
    blue = Random.nextInt(256),
    alpha = 255
)