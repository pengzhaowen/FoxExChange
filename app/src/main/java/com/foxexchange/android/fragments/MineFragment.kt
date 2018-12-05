package com.foxexchange.android.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.cjwsc.idcm.Utils.GlideUtil
import com.cjwsc.idcm.base.ui.view.roundimge.CircleImageView
import com.cjwsc.idcm.kotlin.base.BaseFragment
import com.foxexchange.android.MainActivity
import com.foxexchange.android.R
import com.foxexchange.user.MyAssetActivity
import kotlinx.android.synthetic.main.mine_frg_layout.*

class MineFragment : BaseFragment(), View.OnClickListener {

    override val layoutId: Int
        get() = R.layout.mine_frg_layout

    override fun onInitView(bundle: Bundle?) {
//        GlideUtil.loadImageView(mContext, R.mipmap.login_head, head_img)
//        person_center_user_name.text = "凌"
    }

    override fun onEvent() {
        is_login_ly.setOnClickListener(this)
        recharge_coins_ly.setOnClickListener(this)
        withdraw_coins_ly.setOnClickListener(this)
        transfer_coins_ly.setOnClickListener(this)
        my_asset_ly.setOnClickListener(this)
        my_orders_ly.setOnClickListener(this)
        certification_ly.setOnClickListener(this)
        invite_commission_ly.setOnClickListener(this)
        security_center_ly.setOnClickListener(this)
        withdraw_addr_ly.setOnClickListener(this)
        messages_center_ly.setOnClickListener(this)
        help_center_ly.setOnClickListener(this)
        personal_setting_ly.setOnClickListener(this)
    }

    override fun lazyFetchData() {

    }

    override fun onClick(v: View?) {
        when(v){
            is_login_ly -> isLogin()
            recharge_coins_ly -> {
                jumpToNext(MyAssetActivity().javaClass)
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
    private fun  jumpToNext(t: Class<Any>){
        val intent  = Intent()
        intent.setClass(mContext, t)
        startActivity(intent)
    }

    private fun isLogin(){
        Toast.makeText(mContext, "登陆了", Toast.LENGTH_SHORT).show()
        GlideUtil.loadImageView(mContext, R.mipmap.login_head, head_img)
        person_center_user_name.text = "凌"
    }
}