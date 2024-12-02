package com.example.kotlin_basics.model

data class WeatherResponse (
    val main: Main,
)



data class Main(
    val temp:Float,
)
