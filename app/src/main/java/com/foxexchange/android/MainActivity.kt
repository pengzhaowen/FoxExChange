package com.foxexchange.android

import android.os.Bundle
import com.cjwsc.idcm.Utils.ToastUtil
import com.cjwsc.idcm.base.AppManager
import com.cjwsc.idcm.kotlin.base.BaseActivity
import com.cjwsc.idcm.widget.NavigateTabBar
import com.foxexchange.android.fragments.*
import com.orhanobut.logger.Logger

class MainActivity : BaseActivity() {
    var languageTag: String? = ""
    var isOpen = false
    var mNavigateTabBar: NavigateTabBar? = null


    override val layoutId: Int get() = R.layout.activity_main



    override fun onInitView(bundle: Bundle?) {
        isOpen = true
        initNavigeteTabBar()
        val intent = intent
        val bundleString = intent.getBundleExtra("Language")
        if (bundleString != null) {
            languageTag = bundleString.getString("language")
        }
    }

    private fun initNavigeteTabBar() {
        mNavigateTabBar = findViewById(R.id.home_navigate)

        val HOME_PAGE = getString(R.string.str_home)
        mNavigateTabBar!!.addTab(HomeFragment::class.java,
                NavigateTabBar.TabParam(
                        R.mipmap.home,
                        R.mipmap.home_sel,
                        HOME_PAGE))
        val MARKET_PAGE = getString(R.string.str_market)
        mNavigateTabBar!!.addTab(MarketFragment::class.java,
                NavigateTabBar.TabParam(
                        R.mipmap.market,
                        R.mipmap.market_sel,
                        MARKET_PAGE))

        val C2C_PAGE = getString(R.string.str_c2c)
        mNavigateTabBar!!.addTab(C2CFragment::class.java,
                NavigateTabBar.TabParam(
                        R.mipmap.c2c,
                        R.mipmap.c2c_sel,
                        C2C_PAGE))

        val EXCHANGE_PAGE = getString(R.string.str_exchange)
        mNavigateTabBar!!.addTab(ExchangeFragment::class.java,
                NavigateTabBar.TabParam(
                        R.mipmap.exchange,
                        R.mipmap.exchange_sel,
                        EXCHANGE_PAGE))

        val MINE_PAGE = getString(R.string.str_mine)
        mNavigateTabBar!!.addTab(MineFragment::class.java,
                NavigateTabBar.TabParam(
                        R.mipmap.mine,
                        R.mipmap.mine_sel,
                        MINE_PAGE))

        mNavigateTabBar!!.setTabSelectListener(object : NavigateTabBar.OnTabSelectedListener {
            override fun onTabSelected(holder: NavigateTabBar.ViewHolder) {
                when(holder.tag.toString()){
                    HOME_PAGE ->  mNavigateTabBar!!.showFragment(holder)
                    MARKET_PAGE-> mNavigateTabBar!!.showFragment(holder)
                    C2C_PAGE-> mNavigateTabBar!!.showFragment(holder)
                    EXCHANGE_PAGE-> mNavigateTabBar!!.showFragment(holder)
                    MINE_PAGE-> mNavigateTabBar!!.showFragment(holder)
                }
            }
        })
    }


    override fun onEvent() {
    }


    override fun onBackPressed() {
        exitApp()
    }

    /**
     * 退出应用
     */

    private var exitTime: Long = 0

    fun exitApp() {
        if (System.currentTimeMillis() - exitTime > 2000) {
            ToastUtil.show(getString(R.string.tv_again_click_out))
            exitTime = System.currentTimeMillis()
        } else {
            AppManager.getInstance().finishAllActivity()
            finish()
            System.exit(0)
        }
    }
}
