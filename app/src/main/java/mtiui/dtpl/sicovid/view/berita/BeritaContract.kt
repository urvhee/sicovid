package mtiui.dtpl.sicovid.view.berita

import android.content.Context
import android.content.res.Resources
import android.view.View
import mtiui.dtpl.sicovid.data.Berita
import mtiui.dtpl.sicovid.view.base.MvpPresenter
import mtiui.dtpl.sicovid.view.base.MvpView


class BeritaContract{

    interface BeritaView: MvpView {
        fun createAdapter()
        fun showToast(message: String)
        fun setBerita(beritas: Array<Berita>)
        fun showLoading()
        fun hideLoading()
    }

    interface BeritaPresenter<V : MvpView> : MvpPresenter<V>{
        fun initAdapter()
        fun initData()
    }

}