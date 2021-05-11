package mtiui.dtpl.sicovid.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BeritaData(
    @SerializedName("content")
    @Expose
    val content: List<Berita>?,

    @SerializedName("pageable")
    @Expose
    val pageable: PageableResponse?,

    @SerializedName("totalElements")
    @Expose
    val totalElements: Int?,

    @SerializedName("totalPages")
    @Expose
    val totalPages: Int?,

    @SerializedName("last")
    @Expose
    val last: Boolean?,

    @SerializedName("first")
    @Expose
    val first: Boolean?,

    @SerializedName("sort")
    @Expose
    val sort: SortResponse?,

    @SerializedName("size")
    @Expose
    val size: Int?,

    @SerializedName("number")
    @Expose
    val number: Int?,

    @SerializedName("numberOfElements")
    @Expose
    val numberOfElements: Int?,

    @SerializedName("empty")
    @Expose
    val empty: Boolean?
)