package mtiui.dtpl.sicovid.network

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiService {
    //assuming that the api using GET Method
    @GET("berita")
    fun getBeritaById(@Header("Authorization") token: String = "",
                          @Query("id") id: Int = 0): Observable<String> // ResponseDetailBerita (robopojo)
}