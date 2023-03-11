package br.com.rodorush.api

import retrofit2.Retrofit

class RetrofitInit {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://imdb-api.com/API/Top250Movies/")
        .build()

    val movieService: MovieService
        get() = retrofit.create(MovieService::class.java)
}