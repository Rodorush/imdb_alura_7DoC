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
import br.com.rodorush.ui.MovieItem

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
                        titulo = "Interestellar",
                        imagem = "https://m.media-amazon.com/images/M/MV5BMjMwMjUzNjc3Nl5BMl5BanBnXkFtZTgwOTk3MTQ3MjE@._V1_FMjpg_UX1000_.jpg",
                        nota = 8.6.toBigDecimal(),
                        ano = 2014
                    ),
                    Movie(
                        titulo = "Pulp Fiction: Tempo de Violência",
                        imagem = "https://m.media-amazon.com/images/M/MV5BN2RiMTA1ZGQtOTNhYi00MjQyLTk0MzAtMWE1OTM2NWUxNzBkXkEyXkFqcGdeQXVyMTAzMDM4MjM0._V1_FMjpg_UX1000_.jpg",
                        nota = 8.9.toBigDecimal(),
                        ano = 1994
                    ),
                    Movie(
                        titulo = "O Poderoso Chefão",
                        imagem = "https://m.media-amazon.com/images/M/MV5BZjgwNzE5ODgtYzAyZC00YTZhLThhNDktMDVlOGNhYzk5NTVkXkEyXkFqcGdeQXVyMTAzMDM4MjM0._V1_FMjpg_UX1000_.jpg",
                        nota = 9.2.toBigDecimal(),
                        ano = 1972
                    ),
                    Movie(
                        titulo = "O Resgate do Soldado Ryan",
                        imagem = "https://m.media-amazon.com/images/M/MV5BMTYyMDRiNTQtNjY4NC00MWI1LWIyZTAtYjQ1ZDJjMjdkYzM0XkEyXkFqcGdeQXVyODc0OTEyNDU@._V1_FMjpg_UX1000_.jpg",
                        nota = 8.6.toBigDecimal(),
                        ano = 1998
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