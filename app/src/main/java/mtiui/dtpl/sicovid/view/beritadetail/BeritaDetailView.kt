package mtiui.dtpl.sicovid.view.beritadetail

import mtiui.dtpl.sicovid.data.DetailBerita

interface BeritaDetailView {

    fun onSuccessDetailBerita(data: DetailBerita)
    fun onError(msg: String)
}