package br.com.rodorush

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.rodorush.models.Movie
import br.com.rodorush.models.MovieItem

@Composable
@Preview
fun App() {
    MaterialTheme(
        colors = darkColors(),
    ) {
        Surface {
            Box(
                modifier = Modifier
                    //.size(187.dp, 350.dp),
                    .fillMaxSize(),
                //contentAlignment = Alignment.Center
            ) {
                val movies = listOf(
                    Movie(
                        title = "Interestellar",
                        image = "https://m.media-amazon.com/images/M/MV5BMjMwMjUzNjc3Nl5BMl5BanBnXkFtZTgwOTk3MTQ3MjE@._V1_FMjpg_UX1000_.jpg",
                        imDbRating = 8.6,
                        year = 2014
                    ),
                    Movie(
                        title = "Pulp Fiction: Tempo de Violência",
                        image = "https://m.media-amazon.com/images/M/MV5BN2RiMTA1ZGQtOTNhYi00MjQyLTk0MzAtMWE1OTM2NWUxNzBkXkEyXkFqcGdeQXVyMTAzMDM4MjM0._V1_FMjpg_UX1000_.jpg",
                        imDbRating = 8.9,
                        year = 1994
                    ),
                    Movie(
                        title = "O Poderoso Chefão",
                        image = "https://m.media-amazon.com/images/M/MV5BZjgwNzE5ODgtYzAyZC00YTZhLThhNDktMDVlOGNhYzk5NTVkXkEyXkFqcGdeQXVyMTAzMDM4MjM0._V1_FMjpg_UX1000_.jpg",
                        imDbRating = 9.2,
                        year = 1972
                    ),
                    Movie(
                        title = "O Resgate do Soldado Ryan",
                        image = "https://m.media-amazon.com/images/M/MV5BMTYyMDRiNTQtNjY4NC00MWI1LWIyZTAtYjQ1ZDJjMjdkYzM0XkEyXkFqcGdeQXVyODc0OTEyNDU@._V1_FMjpg_UX1000_.jpg",
                        imDbRating = 8.6,
                        year = 1998
                    )
                )

                LazyColumn {
                    items(movies) { movie ->
                        MovieItem(
                            movie
                        )
                    }
                }
            }
        }
    }
}