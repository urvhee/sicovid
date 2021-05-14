package mtiui.dtpl.sicovid.data.rekappasien

import com.google.gson.annotations.SerializedName


data class ContentItem(

    @field:SerializedName("total")
    val total: Int? = null,

    @field:SerializedName("jumlah_rawat_daily")
    val jumlahRawatDaily: Int? = null,

    @field:SerializedName("jumlah_meninggal")
    val jumlahMeninggal: Int? = null,

    @field:SerializedName("total_daily")
    val totalDaily: Int? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("jumlah_meninggal_daily")
    val jumlahMeninggalDaily: Int? = null,

    @field:SerializedName("kecamatan_nama")
    val kecamatanNama: String? = null,

    @field:SerializedName("jumlah_sembuh_daily")
    val jumlahSembuhDaily: Int? = null,

    @field:SerializedName("jumlah_sembuh")
    val jumlahSembuh: Int? = null,

    @field:SerializedName("kecamatan_id")
    val kecamatanId: Int? = null,

    @field:SerializedName("jumlah_rawat")
    val jumlahRawat: Int? = null
)