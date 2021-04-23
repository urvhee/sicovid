package mtiui.dtpl.sicovid.view.statistik

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_statistic.*
import mtiui.dtpl.sicovid.R
import mtiui.dtpl.sicovid.view.beritadetail.BeritaDetailActivity
import java.net.URLEncoder

class StatisticFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_statistic, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_emergency.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "119")
            startActivity(dialIntent)
        }

        cl_aduan_bencana.setOnClickListener {
            val text = "Halo SICovid, saya terinfeksi covid 19 dan membutuhkan bantuan \uD83D\uDE4F"
            val textEncoded = URLEncoder.encode(text, "UTF-8")
            val contact = "+62 82138129177"
            val url = "https://api.whatsapp.com/send?phone=$contact&text=$textEncoded"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        cl_aduan_kerumunan.setOnClickListener {
            val text = "Halo SICovid, saya ingin mengadukan kerumunan warga \uD83D\uDE4F"
            val textEncoded = URLEncoder.encode(text, "UTF-8")
            val contact = "+62 82138129177"
            val url = "https://api.whatsapp.com/send?phone=$contact&text=$textEncoded"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        text_to_detail_berita.setOnClickListener {
            val i = Intent(this.context, BeritaDetailActivity::class.java)
            startActivity(i)
        }

    }
}