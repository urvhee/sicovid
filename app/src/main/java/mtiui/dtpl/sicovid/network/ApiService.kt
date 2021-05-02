package mtiui.dtpl.sicovid.network

import io.reactivex.Observable
import mtiui.dtpl.sicovid.data.Berita
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiService {
    //assuming that the api using GET Method
    @GET("api/v1/berita/{id}")
    fun getBeritaById(
        @Header("Authorization") token: String = "",
        @Query("id") id: Int = 0
    ): Observable<String> // ResponseDetailBerita (robopojo)

    @GET("api/v1/berita")
    fun getBerita(
        @Header("Authorization") token: String = "",
        @Query("limit") limit: Int = 10,
        @Query("offset") offset: Int = 1
    ): Observable<List<Berita>>
}