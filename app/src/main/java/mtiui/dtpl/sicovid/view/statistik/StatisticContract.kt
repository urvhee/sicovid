package mtiui.dtpl.sicovid.view.statistik

import mtiui.dtpl.sicovid.data.District
import mtiui.dtpl.sicovid.data.Statistic
import mtiui.dtpl.sicovid.view.base.MvpPresenter
import mtiui.dtpl.sicovid.view.base.MvpView


class StatisticContract{

    interface StatisticView: MvpView {
        fun createAdapter()
        fun showToast(message: String)
        fun setDistrictStatistic(district: Array<District>)
        fun setStatistic(statistic: Statistic)
    }

    interface StatisticPresenter<V : MvpView> : MvpPresenter<V>{
        fun initAdapter()
        fun initDistrictStatisticData()
        fun initStatisticData()
    }

}