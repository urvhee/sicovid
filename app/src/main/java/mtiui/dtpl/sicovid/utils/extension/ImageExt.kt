package mtiui.dtpl.sicovid.utils.extension

import android.widget.ImageView
import coil.api.load
import mtiui.dtpl.sicovid.R

fun ImageView.loadImage(url: String) {
    load(url) {
        crossfade(true)
        placeholder(R.drawable.bg_btn)
        error(R.drawable.bg_btn)
    }
}