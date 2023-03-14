package br.com.rodorush.api

import br.com.rodorush.data.Top250Data
import br.com.rodorush.data.toMovie
import br.com.rodorush.models.Movie
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieWebClient {

    private val service = RetrofitInit().movieService

    fun findTop250Movies(onSuccess: (movies: List<Movie>) -> Unit) {
        service.findTop250Movies().enqueue(object : Callback<Top250Data?> {
            override fun onResponse(
                call: Call<Top250Data?>,
                response: Response<Top250Data?>
            ) {
                //println(response.body()?.string())
                if (response.isSuccessful) {
                    response.body()?.let { data ->
                        val movies = data.items.map { detail ->
                            detail.toMovie()
                        }
                        onSuccess(movies)
                    }
                }
//                val gson = Gson()
//                val json = response.body()?.string()
//                //println(json)
//
//                val top250Data = gson.fromJson(json, Top250Data::class.java)
//                //println("My movies: ${top250Data.items}")
//                val top250DataDetail: List<Top250DataDetail> = top250Data.items

            }

            override fun onFailure(
                call: Call<Top250Data?>,
                t: Throwable
            ) {

            }
        })
    }
}