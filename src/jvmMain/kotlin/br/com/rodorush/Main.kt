package br.com.rodorush

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import br.com.rodorush.api.MovieWebClient
import br.com.rodorush.models.Movie

fun main() = application {
    val movieWebClient = MovieWebClient()
    var movies: List<Movie> by remember {
        mutableStateOf<List<Movie>>(emptyList())
    }
    movieWebClient.findTop250Movies {
        movies = it
    }

    Window(title = "IMDB", onCloseRequest = ::exitApplication) {
        App(movies)
        //App()
    }
}