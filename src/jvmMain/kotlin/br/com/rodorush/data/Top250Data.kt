package br.com.rodorush.data

import br.com.rodorush.models.Movie

data class Top250Data (
        val items: List<Top250DataDetail>,
        val errorMessage: String
)