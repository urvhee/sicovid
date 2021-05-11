package mtiui.dtpl.sicovid.view.beritadetail

import android.content.Context
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import mtiui.dtpl.sicovid.network.ConfigRetrofit

class BeritaDetailPresenter(var modelView: BeritaDetailView, var context: Context) {

    fun getDetailBerita(id: Int) {
        val compositeDisposable = CompositeDisposable()
        val disposable = ConfigRetrofit.retrofit.getBeritaById(id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                    r -> modelView.onSuccessDetailBerita(r)
            }, {
                    e -> modelView.onError(e.toString())
            }, {})
        compositeDisposable.add(disposable)
    }
}