package br.com.rodorush

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.rodorush.models.Movie
import br.com.rodorush.models.MovieItem

@Composable
@Preview
fun App(movies: List<Movie>) {
    MaterialTheme(
        colors = darkColors(),
    ) {
        Surface {
            Box(modifier = Modifier.fillMaxSize()) {
                //LazyColumn {
                LazyVerticalGrid(GridCells.Adaptive(150.dp)) {
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