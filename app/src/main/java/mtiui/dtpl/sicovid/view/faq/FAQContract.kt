package mtiui.dtpl.sicovid.view.faq

import android.content.Context
import android.content.res.Resources
import android.view.View
import mtiui.dtpl.sicovid.data.Berita
import mtiui.dtpl.sicovid.data.FAQ
import mtiui.dtpl.sicovid.view.base.MvpPresenter
import mtiui.dtpl.sicovid.view.base.MvpView


class FAQContract{

    interface FAQView: MvpView {
        fun createAdapter()
        fun showToast(message: String)
        fun setFAQ(faqs: Array<FAQ>)
    }

    interface FAQPresenter<V : MvpView> : MvpPresenter<V>{
        fun initAdapter()
        fun initData()
    }

}