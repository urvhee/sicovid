package mtiui.dtpl.sicovid.view.berita.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import mtiui.dtpl.sicovid.R
import mtiui.dtpl.sicovid.data.Berita
import mtiui.dtpl.sicovid.utils.extension.loadImage


class BeritaAdapter(private val listener: BeritaListener) : RecyclerView.Adapter<BeritaAdapter.BeritaViewHolder>() {
    private var mData = emptyArray<Berita>()

    interface BeritaListener {
        fun onClickItem(berita: Berita)
    }

    inner class BeritaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgPhoto: ImageView = view.findViewById(R.id.iv_news)
        val title: TextView = view.findViewById(R.id.tv_title)
        val time: TextView = view.findViewById(R.id.tv_time)
        val clNewsItem: ConstraintLayout = view.findViewById(R.id.cl_news_item)

        fun bind(berita: Berita, listener: BeritaListener) {
            // TODO: Convert time and show
            berita.image?.let {
                imgPhoto.loadImage(it)
            }
            title.text = berita.title
            clNewsItem.setOnClickListener {
                listener.onClickItem(berita)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeritaAdapter.BeritaViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return BeritaViewHolder(view)
    }

    override fun onBindViewHolder(holder: BeritaAdapter.BeritaViewHolder, position: Int) {
        holder.bind(mData[position], listener)
    }

    override fun getItemCount() : Int = mData.size

}