package mtiui.dtpl.sicovid.view.base

open class BasePresenter<V : MvpView> : MvpPresenter<V> {

    var mvpView: V? = null

    override fun getView(): V = mvpView!!

    override fun onAttach(mvpView: V) {
        this.mvpView = mvpView
    }

}