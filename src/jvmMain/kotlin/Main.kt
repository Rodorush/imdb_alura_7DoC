import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    //var text by remember { mutableStateOf("Hello, World!") }
    val largura = 300.0

    MaterialTheme {
        Column {
            Text(text = "Interestelar")
            Image(
                painter = painterResource("capa.jpg"),
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

//        Button(onClick = {
//            text = "Hello, Desktop!"
//        }) {
//            Text(text)
//        }
}

fun main() = application {
    Window(title = "IMDB", onCloseRequest = ::exitApplication) {
        App()
    }
}