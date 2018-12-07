package com.foxexchange.android.fragments

import android.os.Bundle
import android.widget.TextView

import com.cjwsc.idcm.kotlin.base.BaseKTFragment
import com.foxexchange.android.R
import com.foxexchange.android.beans.IncreaseDownBean
import com.lqr.adapter.LQRAdapterForRecyclerView
import com.lqr.adapter.LQRViewHolderForRecyclerView
import com.lqr.recyclerview.LQRRecyclerView

import java.util.ArrayList

class IncreaseorDownKTFragment :BaseKTFragment() {

    var adapter:LQRAdapterForRecyclerView<Any>?=null
    var lqrRecyclerView:LQRRecyclerView?=null

    override val layoutId: Int
        get() = R.layout.fragment_increaseordown



    override fun onInitView(bundle: Bundle?) {
        lqrRecyclerView=rootView?.findViewById(R.id.datalist)
        lqrRecyclerView?.adapter=object:LQRAdapterForRecyclerView<IncreaseDownBean>(activity,
                ArrayList<IncreaseDownBean>(),R.layout.item_inpreasedown) {
            override fun convert(helper: LQRViewHolderForRecyclerView, item: IncreaseDownBean, position: Int) {

                var tr_tip= helper.getView<TextView>(R.id.tr_tip)//交易兑
                var tr_price_tip= helper.getView<TextView>(R.id.tr_price_tip)//24h成交额
                var rate= helper.getView<TextView>(R.id.rate)//汇率
                var rmb= helper.getView<TextView>(R.id.rmb)//价值多少rmb





            }

        }


        initData()

    }


    fun initData(){

        adapter= lqrRecyclerView?.adapter as LQRAdapterForRecyclerView<Any>

        for (item:Int in 0..5)adapter?.addLastItem(IncreaseDownBean("1","2","3","4"))


    }

    override fun onEvent() {


    }

    override fun lazyFetchData() {

    }
}
