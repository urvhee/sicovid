package mtiui.dtpl.sicovid.view.berita

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_berita.*
import mtiui.dtpl.sicovid.R
import mtiui.dtpl.sicovid.data.Berita
import mtiui.dtpl.sicovid.view.berita.adapter.BeritaAdapter

class BeritaFragment : Fragment(), BeritaAdapter.BeritaListener {

    lateinit var adapter: BeritaAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_berita, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = BeritaAdapter(this)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(context)
    }

    override fun onClickItem(berita: Berita) {
        //TODO: Navigate to berita detail page
    }
}