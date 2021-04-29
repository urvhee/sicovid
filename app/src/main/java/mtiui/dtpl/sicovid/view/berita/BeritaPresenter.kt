package mtiui.dtpl.sicovid.view.berita

import android.annotation.SuppressLint
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import mtiui.dtpl.sicovid.data.Berita
import mtiui.dtpl.sicovid.network.ConfigRetrofit
import mtiui.dtpl.sicovid.view.base.BasePresenter

class BeritaPresenter<V : BeritaContract.BeritaView> : BasePresenter<V>(),
    BeritaContract.BeritaPresenter<V> {

    val limit = 10
    var page = 1

    override fun initAdapter() {
        getView().createAdapter()
    }

    @SuppressLint("CheckResult")
    override fun initData() {

        val request = ConfigRetrofit.retrofit
        val call: Observable<List<Berita>> = request.getBerita("", page, limit)

        call.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(
            { list ->
                getView().setBerita(list.toTypedArray())
                page++
            }, { error ->
                getView().showToast("Error: ${error.message}")
            }
        )
    }
}