package br.com.rodorush.api

import br.com.rodorush.data.Top250Data
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface MovieService {

    @GET(IMDB_API_KEY)
    fun findTop250Movies(): Call<Top250Data>
}