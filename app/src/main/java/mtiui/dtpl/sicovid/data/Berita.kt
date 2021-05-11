package mtiui.dtpl.sicovid.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Berita(
    @SerializedName("id")
    @Expose
    val id: Int?,

    @SerializedName("judul")
    @Expose
    val judul: String?,

    @SerializedName("sumber")
    @Expose
    val sumber: String?,

    @SerializedName("kategori_kategori")
    @Expose
    val kategori: String?,

    @SerializedName("tanggal")
    @Expose
    val tanggal: String?,

    @SerializedName("url_gambar")
    @Expose
    val url: String?
)