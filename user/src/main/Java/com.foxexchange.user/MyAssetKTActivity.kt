package com.foxexchange.user

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.View
import com.cjwsc.idcm.widget.NoPreLoadViewPager
import com.example.user.R
import com.foxexchange.common.activitys.BaseFoxExChangeKTActivity
import com.foxexchange.common.adapter.MyPagerAdapter
import com.foxexchange.user.fragments.AssetListKTFragment
import com.foxexchange.user.fragments.C2CAssetKTFragment
import com.foxexchange.user.fragments.CoinAssetKTFragment
import kotlinx.android.synthetic.main.activity_my_asset_layout.*

/**
 * 我的资产
 * @Ling
 */
class MyAssetKTActivity : BaseFoxExChangeKTActivity(), ViewPager.OnPageChangeListener {

    var tabs : Array<String> =
            arrayOf("资产列表", "币币资产", "C2C资产")

    //fragment集合
    private var fragmentList : ArrayList<Fragment> = arrayListOf(
            AssetListKTFragment(), CoinAssetKTFragment(), C2CAssetKTFragment())

    override val layoutId: Int
        get() = R.layout.activity_my_asset_layout

    override fun onInitView(bundle: Bundle?) {
        frag_vp.adapter = MyPagerAdapter(supportFragmentManager, fragmentList)
        frag_vp.addOnPageChangeListener(this)
        frg_tab.setViewPager(frag_vp, tabs, this, fragmentList)


    }

    override fun onEvent() {

    }


    override fun onPageSelected(position: Int) {
        when(position){
            0 -> {
                tv_account_asset.text = "我的资产"
            }
            1 ->{
                tv_account_asset.text = "币币账户资产"
            }
            2 ->{
                tv_account_asset.text = "C2C账户资产"
            }
        }
    }

    override fun onPageScrollStateChanged(state: Int) {}

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}
}

