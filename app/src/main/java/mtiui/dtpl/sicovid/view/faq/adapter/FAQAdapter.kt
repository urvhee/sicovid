package mtiui.dtpl.sicovid.view.faq.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import mtiui.dtpl.sicovid.R
import mtiui.dtpl.sicovid.data.FAQ

class FAQAdapter : RecyclerView.Adapter<FAQAdapter.FAQViewHolder>() {
    private var mData = emptyArray<FAQ>()

    inner class FAQViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val ivArrow: ImageView = view.findViewById(R.id.iv_arrow)
        private val title: TextView = view.findViewById(R.id.tv_title_faq)
        private val content: TextView = view.findViewById(R.id.tv_content_faq)
        private val clHeadFAQ: ConstraintLayout = view.findViewById(R.id.cl_head_faq)
        private val clContentFAQ: ConstraintLayout = view.findViewById(R.id.cl_content_faq)

        fun bind(faq: FAQ, position: Int) {
            title.text = faq.title
            content.text = faq.content
            clHeadFAQ.setOnClickListener {
                mData[position].isExpand = !mData[position].isExpand
                notifyItemChanged(position)
            }
            ivArrow.rotation = if (mData[position].isExpand) 180f else 0f
            clContentFAQ.visibility = if (faq.isExpand) View.VISIBLE else View.GONE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FAQAdapter.FAQViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_faq, parent, false)
        return FAQViewHolder(view)
    }

    override fun onBindViewHolder(holder: FAQAdapter.FAQViewHolder, position: Int) {
        holder.bind(mData[position], position)
    }

    override fun getItemCount(): Int = mData.size

    fun setFAQ(faqs: Array<FAQ>) {
        mData = faqs
        notifyDataSetChanged()
    }
}