package mtiui.dtpl.sicovid.network

import io.reactivex.Observable
import mtiui.dtpl.sicovid.data.Berita
import mtiui.dtpl.sicovid.data.BeritaResponse
import mtiui.dtpl.sicovid.data.DetailBerita
import mtiui.dtpl.sicovid.data.rekapid.Rekap
import mtiui.dtpl.sicovid.data.rekappasien.ContentItem
import mtiui.dtpl.sicovid.data.rekappasien.Data
import mtiui.dtpl.sicovid.data.rekappasien.RekapPasien
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    //assuming that the api using GET Method
    @GET("api/v1/berita/detail/{id}")
    fun getBeritaById(
        @Path("id") id: Int = 0
    ): Observable<DetailBerita> // ResponseDetailBerita (robopojo)

    @GET("api/v1/beritas")
    fun getBerita(
        @Query("limit") limit: Int = 10,
        @Query("offset") offset: Int = 1
    ): Observable<BeritaResponse>

    @GET("api/v1/rekap_pasien_covid/find")
    fun getRekapPasien(
        @Query("limit") limit: Int = 10,
        @Query("offset") offset: Int = 1
    ): Observable<RekapPasien>

    @GET("api/v1/rekap_pasien_covid/find/{id}")
    fun getRekapByID(
        @Path("id") id: Int = 0
    ): Observable<Rekap>
}