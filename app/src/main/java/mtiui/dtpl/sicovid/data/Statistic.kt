package mtiui.dtpl.sicovid.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Statistic(
    @SerializedName("updateTime")
    @Expose
    val updateTime: String?,

    @SerializedName("treatedTotal")
    @Expose
    var treatedTotal: Int = 0,

    @SerializedName("healedTotal")
    @Expose
    var healedTotal: Int = 0,

    @SerializedName("deathTotal")
    @Expose
    var deathTotal: Int = 0,

    @SerializedName("treatedToday")
    @Expose
    var treatedToday: Int = 0,

    @SerializedName("healedToday")
    @Expose
    var healedToday: Int = 0,

    @SerializedName("deathToday")
    @Expose
    var deathToday: Int = 0
) {
    fun positiveTotal() : Int = treatedTotal + healedTotal + deathTotal
    fun positiveToday() : Int = treatedToday + healedToday + deathToday
}