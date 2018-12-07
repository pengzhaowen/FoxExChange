package com.foxexchange.android.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.cjwsc.idcm.Utils.GlideUtil
import com.cjwsc.idcm.kotlin.base.BaseKTFragment
import com.foxexchange.android.R
import com.foxexchange.user.MyAssetKTActivity
import kotlinx.android.synthetic.main.fragment_mine_layout.*

class MineKTFragment : BaseKTFragment() {

    override val layoutId: Int
        get() = R.layout.fragment_mine_layout

    override fun onInitView(bundle: Bundle?) {
//        GlideUtil.loadImageView(mContext, R.mipmap.icon_login_head, head_img)
//        person_center_user_name.text = "凌"
    }

    override fun onEvent() {
        is_login_ly.setOnClickListener(this::onClick)
        recharge_coins_ly.setOnClickListener(this::onClick)
        withdraw_coins_ly.setOnClickListener(this::onClick)
        transfer_coins_ly.setOnClickListener(this::onClick)
        my_asset_ly.setOnClickListener(this::onClick)
        my_orders_ly.setOnClickListener(this::onClick)
        certification_ly.setOnClickListener(this::onClick)
        invite_commission_ly.setOnClickListener(this::onClick)
        security_center_ly.setOnClickListener(this::onClick)
        withdraw_addr_ly.setOnClickListener(this::onClick)
        messages_center_ly.setOnClickListener(this::onClick)
        help_center_ly.setOnClickListener(this::onClick)
        personal_setting_ly.setOnClickListener(this::onClick)
    }

    override fun lazyFetchData() {

    }

    fun onClick(v: View?) {
        when (v) {
            is_login_ly -> isLogin()

            recharge_coins_ly -> {  //我的资产
                jumpToNext(MyAssetKTActivity().javaClass)
            }

            withdraw_coins_ly -> isLogin()

            transfer_coins_ly -> isLogin()

            my_asset_ly -> isLogin()

            my_orders_ly -> isLogin()

            certification_ly -> isLogin()

            invite_commission_ly -> isLogin()

            security_center_ly -> isLogin()

            withdraw_addr_ly -> isLogin()

            messages_center_ly -> isLogin()

            help_center_ly -> isLogin()

            personal_setting_ly -> isLogin()
        }
    }

    //跳转二级页面
    private fun jumpToNext(t: Class<Any>) {
        val intent = Intent()
        intent.setClass(mContext, t)
        startActivity(intent)
    }

    private fun isLogin() {
        Toast.makeText(mContext, "登陆了", Toast.LENGTH_SHORT).show()
        GlideUtil.loadImageView(mContext, R.mipmap.icon_login_head, head_img)
        person_center_user_name.text = "凌"
    }
}