package com.foxexchange.android.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.cjwsc.idcm.base.BaseView
import com.cjwsc.idcm.kotlin.base.BaseFragment
import com.flyco.tablayout.SegmentTabLayout
import com.foxexchange.android.R
import com.foxexchange.android.utils.GlideImageLoader
import com.lqr.adapter.LQRAdapterForRecyclerView
import com.lqr.adapter.LQRViewHolderForRecyclerView
import com.youth.banner.Banner
import com.youth.banner.BannerConfig
import com.youth.banner.Transformer
import com.youth.banner.listener.OnBannerListener

class HomeFragment : BaseFragment() {


    var adapter:LQRAdapterForRecyclerView<*>?=null
    var titles= mutableListOf<String>("涨幅榜","跌幅榜")
    var fragments:ArrayList<Fragment>?= arrayListOf(IncreaseorDownFragment(),IncreaseorDownFragment())

    override val layoutId: Int
        get() = R.layout.fragment_home_layout

    override fun onInitView(bundle: Bundle?) {
        val root = View.inflate(context, R.layout.layout_home_head, rootView as ViewGroup?) as RelativeLayout
        adapter=object : LQRAdapterForRecyclerView<Any>(activity,ArrayList<Any>(),R.layout.item_home_list){


            override fun convert(helper: LQRViewHolderForRecyclerView?, item: Any?, position: Int) {



            }


        }

        initData(root)

    }


    fun initData(root: View){



       var tab= root.findViewById<SegmentTabLayout>(R.id.segmenttablayout)

        tab.setTabData(titles.toTypedArray(),activity,
                R.id.tablayoutcontainer,fragments)


        initBanner(root,adapter as LQRAdapterForRecyclerView<*>)



    }


    override fun onEvent() {

    }

    override fun lazyFetchData() {

    }

    private fun initBanner(root:View,adapter: LQRAdapterForRecyclerView<*>) {

        var banner=root.findViewById<Banner>(R.id.banner)
        //设置banner样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR)
        //设置图片加载器
        banner.setImageLoader(GlideImageLoader())
        //设置图片集合
       // banner.setImages(uris)
        //设置banner动画效果
        banner.setBannerAnimation(Transformer.Default)
        //设置标题集合（当banner样式有显示title时）
        //
        //  banner.setBannerTitles(titles)
        //设置自动轮播，默认为true
        banner.isAutoPlay(true)
        //设置轮播时间
        banner.setDelayTime(10000)
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.CENTER)
        //banner设置方法全部调用完毕时最后调用
        banner.start()

        banner.setOnBannerListener {
//            val intent = Intent(activity, WebViewActivity::class.java)
//            intent.putExtra("url", "https://cmccoin.io/")
//
//            startActivity(intent)
        }

        adapter.headerAndFooterAdapter.addHeaderView(root)


    }

}