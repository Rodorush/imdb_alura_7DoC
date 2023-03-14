package br.com.rodorush.models

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rodorush.extensions.loadImageBitmap

@Composable
fun MovieItem(movie: Movie) {
    Column(
        modifier = Modifier
            .width(200.dp)
            .padding(16.dp),
        //horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            bitmap = movie.image.loadImageBitmap(),
            contentDescription = "Capa do filme",
            modifier = Modifier
                //.width(largura.dp)
                .fillMaxWidth()
                //.height((largura * 1.441).dp)
                .clip(RoundedCornerShape(4.dp))
        )
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 8.dp, start = 8.dp, end = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                //modifier = Modifier.padding(end = 48.dp)
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "Ícone de estrla para nota",
                    tint = Color.Yellow,
                    modifier = Modifier.height(16.dp)
                )
                Text(
                    text = movie.rating.toString(),
                    modifier = Modifier.padding(start = 2.dp),
                    color = Color(0xffeeeeee),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Text(movie.year.toString(), fontSize = 14.sp, color = Color(0xffeeeeee))
        }
        Text(
            text = movie.title, modifier = Modifier.padding(start = 16.dp, top = 8.dp, 16.dp),
            fontSize = 12.sp,
            textAlign = TextAlign.Center
        )
    }
}