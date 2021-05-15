package mtiui.dtpl.sicovid.view.statistik

import android.annotation.SuppressLint
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import mtiui.dtpl.sicovid.data.BeritaResponse
import mtiui.dtpl.sicovid.data.District
import mtiui.dtpl.sicovid.data.Statistic
import mtiui.dtpl.sicovid.data.rekapid.Rekap
import mtiui.dtpl.sicovid.data.rekappasien.ContentItem
import mtiui.dtpl.sicovid.data.rekappasien.Data
import mtiui.dtpl.sicovid.data.rekappasien.RekapPasien
import mtiui.dtpl.sicovid.network.ConfigRetrofit
import mtiui.dtpl.sicovid.view.base.BasePresenter
import java.text.SimpleDateFormat
import java.util.*

class StatisticPresenter<V : StatisticContract.StatisticView> : BasePresenter<V>(),
    StatisticContract.StatisticPresenter<V> {

    val limit = 10
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
                districts.let {
                    for (i in 0 until rekap?.size!!) {
                        districts.add(District(
                            rekap[i]?.kecamatanNama!!,
                            rekap[i]?.jumlahRawat!!,
                            rekap[i]?.jumlahSembuh!!,
                            rekap[i]?.jumlahMeninggal!!
                        ))
                    }
                    getView().setDistrictStatistic(it.toTypedArray())
                }
                page++
            }, { error ->
                getView().showToast("Error: ${error.message}")
            }
        )
    }

    @SuppressLint("CheckResult", "SimpleDateFormat")
    override fun initStatisticData() {
        // TODO: Fetch real statistic data from BE
        val request = ConfigRetrofit.retrofit
        val call: Observable<Rekap> = request.getRekapByID(2)

        val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
        val currentDate = sdf.format(Date())

        call.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(
            { response ->
                val statistic = Statistic(
                    response.data?.kecamatanNama!!,
                    currentDate,//"2021-04-27T00:00:00.000+0000",
                    response.data.total!!,
                    response.data.jumlahRawat!!,
                    response.data.jumlahSembuh!!,
                    response.data.jumlahMeninggal!!,
                    response.data.totalDaily!!,
                    response.data.jumlahRawatDaily!!,
                    response.data.jumlahSembuhDaily!!,
                    response.data.jumlahMeninggalDaily!!
                )
                getView().setStatistic(statistic)
            }, { error ->
                getView().showToast("Error: ${error.message}")
            }
        )
    }
}