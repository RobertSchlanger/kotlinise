package com.example.hello

fun degreeToCardinalDirection(degree: Int) =
    when(degree) {
        0, 360 -> 'N'
        90 -> 'E'
        180 -> 'S'
        270 -> 'W'
        else -> 'X'
    }

degreeToCardinalDirection(90)
degreeToCardinalDirection(270)
degreeToCardinalDirection(131)