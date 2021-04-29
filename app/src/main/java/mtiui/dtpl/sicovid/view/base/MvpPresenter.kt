package mtiui.dtpl.sicovid.view.base


interface MvpPresenter<V : MvpView> {

    fun onAttach(mvpView: V)
    fun getView(): V?

}