package mtiui.dtpl.sicovid.view.berita

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_berita.*
import mtiui.dtpl.sicovid.R
import mtiui.dtpl.sicovid.data.Berita
import mtiui.dtpl.sicovid.view.base.BaseFragment
import mtiui.dtpl.sicovid.view.berita.adapter.BeritaAdapter

class BeritaFragment : BaseFragment(), BeritaContract.BeritaView, BeritaAdapter.BeritaListener {

    lateinit var adapter: BeritaAdapter
    lateinit var BPresenter: BeritaPresenter<BeritaContract.BeritaView>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_berita, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        BPresenter = BeritaPresenter()
        BPresenter.run {
            initAdapter()
            initData()
        }
    }

    override fun onClickItem(berita: Berita) {
        //TODO: Navigate to berita detail page
    }

    override fun createAdapter() {
        adapter = BeritaAdapter(this)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(context)
    }

    override fun showToast(message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }

    override fun setBerita(beritas: Array<Berita>) {
        adapter.setBerita(beritas)
    }
}