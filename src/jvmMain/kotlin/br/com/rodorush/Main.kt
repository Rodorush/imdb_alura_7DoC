package br.com.rodorush

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(title = "IMDB", onCloseRequest = ::exitApplication) {
        App()
    }
}