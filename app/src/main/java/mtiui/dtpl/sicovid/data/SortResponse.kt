package mtiui.dtpl.sicovid.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SortResponse(
    @SerializedName("sorted")
    @Expose
    val sorted: Boolean?,

    @SerializedName("unsorted")
    @Expose
    val unsorted: Boolean?,

    @SerializedName("empty")
    @Expose
    val empty: Boolean?
)