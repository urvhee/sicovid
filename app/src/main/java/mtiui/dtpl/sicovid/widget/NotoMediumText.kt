package mtiui.dtpl.sicovid.widget

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class NotoMediumText @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {
    override fun setTypeface(tf: Typeface?) {
        val face = Typeface.createFromAsset(context.assets, "NotoSans-Medium.ttf")
        super.setTypeface(face)
    }
}