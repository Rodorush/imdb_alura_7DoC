package br.com.rodorush

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import br.com.rodorush.extensions.loadImageBitmap
import org.jetbrains.skia.FontWeight

@Composable
@Preview
fun App() {
    val largura = 200.0
    val image =
        "https://m.media-amazon.com/images/M/MV5BMjMwMjUzNjc3Nl5BMl5BanBnXkFtZTgwOTk3MTQ3MjE@._V1_FMjpg_UX1000_.jpg"

    MaterialTheme(
        colors = darkColors(),
    ) {
        Surface {
            Box(
                modifier = Modifier
                    .size(187.dp, 350.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier.padding(4.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        bitmap = image.loadImageBitmap(),
                        contentDescription = "Interestelar",
                        modifier = Modifier.width(largura.dp)
                            .height((largura * 1.441).dp)
                            .clip(RoundedCornerShape(16.dp))
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row (
                            modifier = Modifier.padding(end = 48.dp)
                        ){
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "Nota",
                                tint = Color.Yellow,
                                modifier = Modifier.size(16.dp)
                            )
                            Text(
                                text = "8.6",
                                fontWeight = androidx.compose.ui.text.font.FontWeight(FontWeight.BOLD),
                                )
                        }
                        Text(text = "2014", modifier = Modifier.padding(start = 48.dp))
                    }
                    Text(text = "Interestelar", modifier = Modifier.padding(4.dp))
                }
            }
        }
    }
}

fun main() = application {
    Window(title = "IMDB", onCloseRequest = ::exitApplication) {
        App()
    }
}