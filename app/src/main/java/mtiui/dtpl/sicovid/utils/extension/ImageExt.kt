package mtiui.dtpl.sicovid.utils.extension

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.widget.ImageView
import androidx.annotation.DrawableRes
import coil.api.load
import coil.transform.RoundedCornersTransformation
import mtiui.dtpl.sicovid.R

fun ImageView.loadImage(url: String) {
    load(url) {
        crossfade(true)
        placeholder(R.drawable.placeholder_image)
        error(R.drawable.placeholder_image)
        transformations(RoundedCornersTransformation(4f,4f,4f,4f))
    }
}

@SuppressLint("ObsoleteSdkInt", "UseCompatLoadingForDrawables")
fun ImageView.setAssetImage(context: Context, @DrawableRes drawableRes: Int) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        setImageDrawable(context.getDrawable(drawableRes))
    } else {
        setImageDrawable(context.resources.getDrawable(drawableRes))
    }
}