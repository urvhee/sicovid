package mtiui.dtpl.sicovid.view.statistik.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mtiui.dtpl.sicovid.R
import mtiui.dtpl.sicovid.data.District
import java.text.DecimalFormat
import java.text.NumberFormat

class StatisticAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var mData = emptyArray<District>()

    inner class DistrictViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val kecamatan: TextView = view.findViewById(R.id.tv_value_kecamatan)
        private val treated: TextView = view.findViewById(R.id.tv_value_treated)
        private val healed: TextView = view.findViewById(R.id.tv_value_healed)
        private val death: TextView = view.findViewById(R.id.tv_value_death)

        fun bind(district: District) {
            val format: NumberFormat = DecimalFormat("#,###")
            kecamatan.text = district.name
            treated.text = format.format(district.treated).replace(",", ".")
            healed.text = format.format(district.healed).replace(",", ".")
            death.text = format.format(district.death).replace(",", ".")
        }
    }

    inner class DistrictHeadViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            1 -> {
                val view: View =
                    LayoutInflater.from(parent.context).inflate(R.layout.item_statistic_body, parent, false)
                DistrictViewHolder(view)
            }
            else -> {
                val view: View =
                    LayoutInflater.from(parent.context).inflate(R.layout.item_statistic_head, parent, false)
                DistrictHeadViewHolder(view)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) 0 else 1
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            1 -> {
                val vh: DistrictViewHolder = holder as DistrictViewHolder
                vh.bind(mData[position-1])
            }
            else -> {
                // No logic needed
            }
        }
    }

    override fun getItemCount(): Int = mData.size + 1

    fun setDistrictStatistic(district: Array<District>) {
        mData = district
        notifyDataSetChanged()
    }
}