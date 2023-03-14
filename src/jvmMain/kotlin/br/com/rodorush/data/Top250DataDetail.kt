package br.com.rodorush.data

import br.com.rodorush.models.Movie

data class Top250DataDetail(
    val id: String,
    val rank: String,
    val title: String,
    val fullTitle: String,
    val year: String,
    val image: String,
    val crew: String,
    val imDbRating: String,
    val imDbRatingCount: String
)

fun Top250DataDetail.toMovie(): Movie = Movie(
    title = this.title,
    image = this.image,
    rating = imDbRating.toDouble(),
    year = year.toInt()
)