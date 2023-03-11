package br.com.rodorush

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import br.com.rodorush.api.MovieWebClient

fun main() = application {
    val movieWebClient = MovieWebClient()

    movieWebClient.findTop250Movies()
    Window(title = "IMDB", onCloseRequest = ::exitApplication) {
        App()
    }
}