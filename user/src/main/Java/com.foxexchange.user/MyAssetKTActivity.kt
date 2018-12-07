package com.foxexchange.user

import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.user.R
import com.foxexchange.common.activitys.BaseFoxExChangeKTActivity
import com.foxexchange.user.fragments.AssetListKTFragment
import com.foxexchange.user.fragments.C2CAssetKTFragment
import com.foxexchange.user.fragments.CoinAssetKTFragment

/**
 * 我的资产
 * @Ling
 */
class MyAssetKTActivity : BaseFoxExChangeKTActivity(){

    var tabs : Array<String> =
            arrayOf("资产列表", "币币资产", "C2C资产")

    var fragmentList = ArrayList<Fragment>()


    override val layoutId: Int
        get() = R.layout.activity_my_asset_layout

    override fun onInitView(bundle: Bundle?) {
        fragmentList.add(AssetListKTFragment())
        fragmentList.add(CoinAssetKTFragment())
        fragmentList.add(C2CAssetKTFragment())

//        frg_tab.

    }

    override fun onEvent() {

    }
}