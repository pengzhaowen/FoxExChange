package foxidcw.android.idcw.common.base

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import com.cjwsc.idcm.base.BaseActivity
import com.cjwsc.idcm.base.BaseModel
import com.cjwsc.idcm.base.BasePresenter
import com.cjwsc.idcm.base.BaseView

abstract class  KTBaseActivity<M : BaseModel?,P : BasePresenter<out BaseView<*>, *>?>: BaseActivity<M, P>() {


}