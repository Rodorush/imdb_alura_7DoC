package br.com.rodorush.models

import java.math.BigDecimal

data class Movie (
    val titulo: String,
    val imagem: String,
    val nota: BigDecimal,
    val ano: Int
)