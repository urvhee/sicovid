package mtiui.dtpl.sicovid.data.rekappasien

import com.google.gson.annotations.SerializedName

data class RekapPasien(

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("totalKasus")
	val totalKasus: Int? = null,

	@field:SerializedName("totalKasusDaily")
	val totalKasusDaily: Int? = null,

	@field:SerializedName("totalElements")
	val totalElements: Int? = null
)
