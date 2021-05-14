package mtiui.dtpl.sicovid.view.statistik

import android.annotation.SuppressLint
import mtiui.dtpl.sicovid.data.District
import mtiui.dtpl.sicovid.data.Statistic
import mtiui.dtpl.sicovid.view.base.BasePresenter

class StatisticPresenter<V : StatisticContract.StatisticView> : BasePresenter<V>(),
    StatisticContract.StatisticPresenter<V> {

    override fun initAdapter() {
        getView().createAdapter()
    }

    @SuppressLint("CheckResult")
    override fun initDistrictStatisticData() {
        val districts = mutableListOf<District>()

        // TODO: Fetch real district data from BE
        for (i in 0..10) {
            districts.add(District("Sukamaju", 12345, 1234, 123))
        }

        getView().setDistrictStatistic(districts.toTypedArray())
    }

    override fun initStatisticData() {
        // TODO: Fetch real statistic data from BE
        val statistic = Statistic(
            "2021-04-27T00:00:00.000+0000",
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