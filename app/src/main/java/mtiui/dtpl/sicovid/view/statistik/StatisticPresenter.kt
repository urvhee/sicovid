package mtiui.dtpl.sicovid.view.statistik

import android.annotation.SuppressLint
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import mtiui.dtpl.sicovid.data.District
import mtiui.dtpl.sicovid.data.Statistic
import mtiui.dtpl.sicovid.data.rekappasien.RekapPasien
import mtiui.dtpl.sicovid.network.ConfigRetrofit
import mtiui.dtpl.sicovid.view.base.BasePresenter

class StatisticPresenter<V : StatisticContract.StatisticView> : BasePresenter<V>(),
    StatisticContract.StatisticPresenter<V> {

    val limit = 500
    var page = 0

    override fun initAdapter() {
        getView().createAdapter()
    }

    @SuppressLint("CheckResult")
    override fun initDistrictStatisticData() {
        val districts = mutableListOf<District>()
        val request = ConfigRetrofit.retrofit
        val call: Observable<RekapPasien> = request.getRekapPasien(limit * (page + 1), page)

        call.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(
            { response ->
                val rekap = response.data?.content
                rekap?.let { r ->
                    for (data in r) {
                        data?.let {
                            districts.add(
                                District(
                                    data.kecamatanNama ?: "-",
                                    data.jumlahRawat ?: 0,
                                    data.jumlahSembuh ?: 0,
                                    data.jumlahMeninggal ?: 0
                                )
                            )
                        }
                    }
                }
                getView().setDistrictStatistic(districts.toTypedArray())
                page++
            }, { error ->
                getView().showToast("Error: ${error.message}")
            }
        )
    }

    //TODO: Wrong implementation, fetch total data per-city. Not District
    @SuppressLint("CheckResult", "SimpleDateFormat")
    override fun initStatisticData() {
        // TODO: Fetch real statistic data from BE
        val statistic = Statistic(
            "2021-05-16T17:00:00.000+0000",
            252207,
            24865,
            224865,
            1865,
            4123,
            123,
            123,
            123
        )
        getView().setStatistic(statistic)
    }
}