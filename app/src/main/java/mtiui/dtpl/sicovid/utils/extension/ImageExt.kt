package mtiui.dtpl.sicovid.utils.extension

import android.widget.ImageView
import coil.api.load
import mtiui.dtpl.sicovid.R

fun ImageView.loadImage(url: String) {
    load(url) {
        crossfade(true)
        placeholder(R.drawable.placeholder_image)
        error(R.drawable.placeholder_image)
    }
}