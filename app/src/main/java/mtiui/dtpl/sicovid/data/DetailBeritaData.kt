package mtiui.dtpl.sicovid.data

import com.google.gson.annotations.SerializedName

data class DetailBeritaData(

    @field:SerializedName("sumber")
    val sumber: String? = null,

    @field:SerializedName("url_gambar")
    val urlGambar: String? = null,

    @field:SerializedName("kategori_kategori")
    val kategoriKategori: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("tanggal")
    val tanggal: String? = null,

    @field:SerializedName("judul")
    val judul: String? = null,

    @field:SerializedName("detail_berita")
    val detailBerita: String? = null,

    @field:SerializedName("additional_detail_berita")
    val additionalDetailBerita: String? = null
)
