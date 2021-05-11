package mtiui.dtpl.sicovid.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BeritaResponse(
    @SerializedName("data")
    @Expose
    val data: BeritaData?,

    @SerializedName("totalElements")
    @Expose
    val totalElements: Int?
)