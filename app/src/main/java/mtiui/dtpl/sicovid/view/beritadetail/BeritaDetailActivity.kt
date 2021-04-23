package mtiui.dtpl.sicovid.view.beritadetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.detail_berita_toolbar.*
import mtiui.dtpl.sicovid.MainActivity
import mtiui.dtpl.sicovid.R
import org.jetbrains.anko.toast

class BeritaDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)

        button_toolbar_back.setOnClickListener { this.finish() }
        button_toolbar_share.setOnClickListener {
            toast("You just clicked the share button")
        }
    }
}