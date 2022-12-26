package com.example.clientkiosk

interface Platform {
    val name: String

}

expect fun getPlatform(): Platform