package mtiui.dtpl.sicovid.data.rekapid

import com.google.gson.annotations.SerializedName

data class Rekap(

	@field:SerializedName("data")
	val data: RekapDataByID? = null
)
