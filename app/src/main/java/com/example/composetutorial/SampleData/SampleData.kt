package com.example.compose.tutorial

import com.example.composetutorial.Message
import com.example.composetutorial.R

object SampleData {
    // Sample conversation data
    val conversationSample = listOf(
        Message(
            "Colleague",
            "Test...Test...Test...",
            R.drawable.ic_launcher_foreground.toString()
        ),
        Message(
            "Friend",
            "List of Android versions:\n" +
                    "Android KitKat (API 19)\n" +
                    "Android Lollipop (API 21)\n" +
                    "Android Marshmallow (API 23)\n" +
                    "Android Nougat (API 24)\n" +
                    "Android Oreo (API 26)\n" +
                    "Android Pie (API 28)\n" +
                    "Android 10 (API 29)\n" +
                    "Android 11 (API 30)\n" +
                    "Android 12 (API 31)\n",
            R.mipmap.ic_launcher_red_gold.toString()
        ),
        Message(
            "Friend",
            "I think Kotlin is my favorite programming language.\n" +
                    "It's so much fun!",
            R.mipmap.ic_launcher_red_gold.toString()
        ),
        Message(
            "Friend",
            "Searching for alternatives to XML layouts...",
            R.mipmap.ic_launcher_red_gold.toString()
        ),
        Message(
            "Colleague",
            "Hey, take a look at Jetpack Compose, it's great!\n" +
                    "It's the Android's modern toolkit for building native UI." +
                    "It simplifies and accelerates UI development on Android." +
                    "Less code, powerful tools, and intuitive Kotlin APIs :)",
            R.drawable.ic_launcher_foreground.toString()
        ),
        Message(
            "Friend",
            "It's available from API 21+ :)",
            R.mipmap.ic_launcher_red_gold.toString()
        ),
        Message(
            "Friend",
            "Writing Kotlin for UI seems so natural, Compose where have you been all my life?",
            R.mipmap.ic_launcher_red_gold.toString()
        ),
        Message(
            "Friend",
            "Android Studio next version's name is Arctic Fox",
            R.mipmap.ic_launcher_red_gold.toString()
        ),
        Message(
            "Colleague",
            "Android Studio Arctic Fox tooling for Compose is top notch ^_^",
            R.drawable.ic_launcher_foreground.toString()
        ),
        Message(
            "Colleague",
            "I didn't know you can now run the emulator directly from Android Studio",
            R.drawable.ic_launcher_foreground.toString()
        ),
        Message(
            "Friend",
            "Compose Previews are great to check quickly how a composable layout looks like",
            R.mipmap.ic_launcher_red_gold.toString()
        ),
        Message(
            "Colleague",
            "Previews are also interactive after enabling the experimental setting",
            R.drawable.ic_launcher_foreground.toString()
        ),
        Message(
            "Friend",
            "Have you tried writing build.gradle with KTS?",
            R.mipmap.ic_launcher_red_gold.toString()
        ),
    )
}