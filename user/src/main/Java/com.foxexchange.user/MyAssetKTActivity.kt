package com.foxexchange.user

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
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
class MyAssetKTActivity : BaseFoxExChangeKTActivity(){

    var tabs : Array<String> =
            arrayOf("资产列表", "币币资产", "C2C资产")

    var fragmentList : ArrayList<Fragment> = arrayListOf(
            AssetListKTFragment(), CoinAssetKTFragment(), C2CAssetKTFragment())

    override val layoutId: Int
        get() = R.layout.activity_my_asset_layout

    override fun onInitView(bundle: Bundle?) {
        frag_vp.adapter = MyPagerAdapter(supportFragmentManager, fragmentList)
        frg_tab.setViewPager(frag_vp, tabs, this, fragmentList)
    }

    override fun onEvent() {

    }
}