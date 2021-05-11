package mtiui.dtpl.sicovid.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PageableResponse(
    @SerializedName("sort")
    @Expose
    val sort: SortResponse?,

    @SerializedName("pageNumber")
    @Expose
    val pageNumber: Int?,

    @SerializedName("pageSize")
    @Expose
    val pageSize: Int?,

    @SerializedName("offset")
    @Expose
    val offset: Int?,

    @SerializedName("paged")
    @Expose
    val paged: Boolean?,

    @SerializedName("unpaged")
    @Expose
    val unpaged: Boolean?
)