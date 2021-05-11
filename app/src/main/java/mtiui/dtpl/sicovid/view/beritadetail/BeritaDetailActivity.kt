package mtiui.dtpl.sicovid.view.beritadetail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.api.load
import kotlinx.android.synthetic.main.activity_berita.*
import kotlinx.android.synthetic.main.detail_berita_toolbar.*
import mtiui.dtpl.sicovid.R
import mtiui.dtpl.sicovid.data.DetailBerita
import mtiui.dtpl.sicovid.data.DetailBeritaData
import mtiui.dtpl.sicovid.utils.ExtraConstant
import mtiui.dtpl.sicovid.utils.extension.formatTo
import mtiui.dtpl.sicovid.utils.extension.toDate
import org.jetbrains.anko.toast

class BeritaDetailActivity : AppCompatActivity(), BeritaDetailView {

    private var presenter: BeritaDetailPresenter? = null
    private var response: DetailBerita? = null
    private var detail: DetailBeritaData? = null

    private var idBerita = 0

    companion object {
        fun getIntent(context: Context?): Intent =
            Intent(context, BeritaDetailActivity::class.java)

        fun getIntentWithBeritaId(context: Context?, id: Int) : Intent = getIntent(context).apply {
            putExtra(ExtraConstant.EXTRA_BERITA_ID, id)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)

        idBerita = intent.getIntExtra(ExtraConstant.EXTRA_BERITA_ID, 0)
        initPresenter()

        button_toolbar_back.setOnClickListener { this.finish() }
        button_toolbar_share.setOnClickListener {
            toast("You just clicked the share button")
        }
    }

    private fun initPresenter() {
        presenter = BeritaDetailPresenter(this, applicationContext)
        presenter?.getDetailBerita(idBerita)
    }

    private fun initView() {
        val timeStr = detail?.tanggal?.toDate()?.formatTo("dd MMMM yyyy")

        img_banner_berita.load(detail?.urlGambar)
        title_berita.text = detail?.judul
        info_berita.text = "${detail?.sumber} - $timeStr WIB"
        konten_berita.text = " ${detail?.detailBerita} \n ${detail?.additionalDetailBerita}"
    }

    override fun onSuccessDetailBerita(data: DetailBerita) {
        response = data
        detail = response?.data

        initView()
    }

    override fun onError(msg: String) {
        toast(msg)
    }
}