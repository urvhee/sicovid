package mtiui.dtpl.sicovid.view.statistik

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_statistic.*
import mtiui.dtpl.sicovid.R
import mtiui.dtpl.sicovid.data.District
import mtiui.dtpl.sicovid.data.Statistic
import mtiui.dtpl.sicovid.utils.extension.formatTo
import mtiui.dtpl.sicovid.utils.extension.toDate
import mtiui.dtpl.sicovid.view.base.BaseFragment
import mtiui.dtpl.sicovid.view.statistik.adapter.StatisticAdapter
import java.net.URLEncoder
import java.text.DecimalFormat
import java.text.NumberFormat

class StatisticFragment : BaseFragment(), StatisticContract.StatisticView {

    lateinit var adapter: StatisticAdapter
    lateinit var SPresenter: StatisticPresenter<StatisticContract.StatisticView>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_statistic, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        SPresenter = StatisticPresenter()
        SPresenter.onAttach(this)
        SPresenter.run {
            initAdapter()
            initStatisticData()
            initDistrictStatisticData()
        }

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

    }

    override fun createAdapter() {
        adapter = StatisticAdapter()
        rv_statistic.adapter = adapter
        rv_statistic.layoutManager = LinearLayoutManager(context)
    }

    override fun showToast(message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }

    override fun setDistrictStatistic(district: Array<District>) {
        adapter.setDistrictStatistic(district)
    }

    @SuppressLint("SetTextI18n")
    override fun setStatistic(statistic: Statistic) {
        val format: NumberFormat = DecimalFormat("#,###")
        val timeStr = statistic.updateTime?.toDate()?.formatTo("dd MMM yyyy, HH:mm")
        tv_update_time.text = timeStr ?: "-"
        tv_positive_total.text = format.format(statistic.positiveTotal()).replace(",", ".")
        tv_positive_today.text = "(${if (statistic.positiveToday() >= 0) "+" else "-"}${format.format(statistic.positiveToday()).replace(",", ".")})"
        tv_treated_total.text = format.format(statistic.treatedTotal).replace(",", ".")
        tv_treated_today.text = "(${if (statistic.treatedToday >= 0) "+" else "-"}${format.format(statistic.treatedToday).replace(",", ".")})"
        tv_healed_total.text = format.format(statistic.healedTotal).replace(",", ".")
        tv_healed_today.text = "(${if (statistic.healedToday >= 0) "+" else "-"}${format.format(statistic.healedToday).replace(",", ".")})"
        tv_death_total.text = format.format(statistic.deathTotal).replace(",", ".")
        tv_death_today.text = "(${if (statistic.deathToday >= 0) "+" else "-"}${format.format(statistic.deathToday).replace(",", ".")})"
    }
}