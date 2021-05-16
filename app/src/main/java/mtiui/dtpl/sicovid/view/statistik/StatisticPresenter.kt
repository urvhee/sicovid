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
import java.text.SimpleDateFormat
import java.util.*

class StatisticPresenter<V : StatisticContract.StatisticView> : BasePresenter<V>(),
    StatisticContract.StatisticPresenter<V> {

    val limit = 500
    var page = 0

    override fun initAdapter() {
        getView().createAdapter()
    }

    @SuppressLint("CheckResult", "SimpleDateFormat")
    override fun initDistrictStatisticData() {
        val districts = mutableListOf<District>()
        val request = ConfigRetrofit.retrofit
        val call: Observable<RekapPasien> = request.getRekapPasien(limit * (page + 1), page)

        call.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(
            { response ->
                val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                val currentDate = sdf.format(Date())
                val statistic = Statistic(currentDate)

                val rekap = response.data?.content
                rekap?.let { r ->
                    for (data in r) {
                        data?.let {
                            statistic.deathToday += data.jumlahMeninggalDaily ?: 0
                            statistic.treatedToday += data.jumlahRawatDaily ?: 0
                            statistic.healedToday += data.jumlahSembuhDaily ?: 0
                            statistic.deathTotal += data.jumlahMeninggal ?: 0
                            statistic.healedTotal += data.jumlahSembuh ?: 0
                            statistic.treatedTotal += data.jumlahRawat ?: 0
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

                getView().setStatistic(statistic)
                getView().setDistrictStatistic(districts.toTypedArray())
                page++
            }, { error ->
                getView().showToast("Error: ${error.message}")
            }
        )
    }

    override fun initStatisticData() {}
}