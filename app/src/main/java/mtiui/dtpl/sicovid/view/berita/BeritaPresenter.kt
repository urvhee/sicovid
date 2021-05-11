package mtiui.dtpl.sicovid.view.berita

import android.annotation.SuppressLint
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import mtiui.dtpl.sicovid.data.BeritaResponse
import mtiui.dtpl.sicovid.network.ConfigRetrofit
import mtiui.dtpl.sicovid.view.base.BasePresenter

class BeritaPresenter<V : BeritaContract.BeritaView> : BasePresenter<V>(),
    BeritaContract.BeritaPresenter<V> {

    val limit = 10
    var page = 0

    override fun initAdapter() {
        getView().createAdapter()
    }

    @SuppressLint("CheckResult")
    override fun initData() {

        val request = ConfigRetrofit.retrofit
        val call: Observable<BeritaResponse> = request.getBerita(page, limit)

        call.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(
            { response ->
                val beritas = response.data?.content
                beritas?.let {
                    getView().setBerita(it.toTypedArray())
                }
                page++
            }, { error ->
                getView().showToast("Error: ${error.message}")
            }
        )
    }
}