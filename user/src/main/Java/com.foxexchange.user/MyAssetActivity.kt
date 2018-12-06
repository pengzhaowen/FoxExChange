package com.foxexchange.user

import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.user.R
import com.foxexchange.common.activitys.BaseFoxExChangeActivity

/**
 * 我的资产
 * @Ling
 */
class MyAssetActivity : BaseFoxExChangeActivity(){

    var tabs : Array<String> =
            arrayOf("资产列表", "币币资产", "C2C资产")

    lateinit var fragmentList : Array<Fragment>


    override val layoutId: Int
        get() = R.layout.activity_my_asset_layout

    override fun onInitView(bundle: Bundle?) {
        fragmentList
    }

    override fun onEvent() {

    }
}