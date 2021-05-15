package mtiui.dtpl.sicovid.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Statistic (
    @SerializedName("city")
    @Expose
    val city: String?,

    @SerializedName("updateTime")
    @Expose
    val updateTime: String?,

    @SerializedName("positiveTotal")
    @Expose
    val positiveTotal: Int,

    @SerializedName("treatedTotal")
    @Expose
    val treatedTotal: Int,

    @SerializedName("healedTotal")
    @Expose
    val healedTotal: Int,

    @SerializedName("deathTotal")
    @Expose
    val deathTotal: Int,

    @SerializedName("positiveToday")
    @Expose
    val positiveToday: Int,

    @SerializedName("treatedToday")
    @Expose
    val treatedToday: Int,

    @SerializedName("healedToday")
    @Expose
    val healedToday: Int,

    @SerializedName("deathToday")
    @Expose
    val deathToday: Int
    )