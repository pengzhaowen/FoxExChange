package com.foxexchange.android

import android.os.Bundle
import com.cjwsc.idcm.kotlin.base.BaseActivity
import com.orhanobut.logger.Logger

class MainActivity : BaseActivity() {
    override val layoutId: Int
        get() = R.layout.activity_main

    override fun onInitView(bundle: Bundle?) {
        Logger.d("-------------onInitView------------>")
    }

    override fun onEvent() {
        Logger.d("-------------onEvent------------>")
    }

}
