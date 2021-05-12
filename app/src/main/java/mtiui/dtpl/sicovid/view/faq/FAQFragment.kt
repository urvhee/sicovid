package mtiui.dtpl.sicovid.view.faq

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_f_a_q.*
import mtiui.dtpl.sicovid.R
import mtiui.dtpl.sicovid.data.FAQ
import mtiui.dtpl.sicovid.view.base.BaseFragment
import mtiui.dtpl.sicovid.view.faq.adapter.FAQAdapter

class FAQFragment : BaseFragment(), FAQContract.FAQView {

    lateinit var adapter: FAQAdapter
    lateinit var FPresenter: FAQPresenter<FAQContract.FAQView>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_f_a_q, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        FPresenter = FAQPresenter()
        FPresenter.onAttach(this)
        FPresenter.run {
            initAdapter()
            initData()
        }
    }

    override fun createAdapter() {
        adapter = FAQAdapter()
        rv_faq.adapter = adapter
        rv_faq.layoutManager = LinearLayoutManager(context)
    }

    override fun showToast(message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }

    override fun setFAQ(faqs: Array<FAQ>) {
        adapter.setFAQ(faqs)
    }
}