package mtiui.dtpl.sicovid.widget

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.res.ResourcesCompat
import mtiui.dtpl.sicovid.R

class NotoText @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {
    override fun setTypeface(tf: Typeface?) {
        val face = ResourcesCompat.getFont(context, R.font.notosans_regular)
        super.setTypeface(face)
    }
}