package mtiui.dtpl.sicovid.view.beritadetail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_berita_toolbar.*
import mtiui.dtpl.sicovid.R
import mtiui.dtpl.sicovid.utils.ExtraConstant
import org.jetbrains.anko.toast

class BeritaDetailActivity : AppCompatActivity() {
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

        button_toolbar_back.setOnClickListener { this.finish() }
        button_toolbar_share.setOnClickListener {
            toast("You just clicked the share button")
        }
    }
}