package br.com.rodorush

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import br.com.rodorush.extensions.loadImageBitmap

@Composable
@Preview
fun App() {
    val largura = 300.0
    val image = "https://m.media-amazon.com/images/M/MV5BMjMwMjUzNjc3Nl5BMl5BanBnXkFtZTgwOTk3MTQ3MjE@._V1_FMjpg_UX1000_.jpg"

    MaterialTheme {
        Column {
            Text(text = "Interestelar")
            Image(
                bitmap = image.loadImageBitmap(),
                contentDescription = "Interestelar",
                modifier = Modifier.width(largura.dp)
                    .height((largura*1.441).dp)
            )
            Row {
                Text(text = "Nota: 8.6")
                Text(text = " - ")
                Text(text = "Ano: 2014")
            }

        }
    }
}

fun main() = application {
    Window(title = "IMDB", onCloseRequest = ::exitApplication) {
        App()
    }
}