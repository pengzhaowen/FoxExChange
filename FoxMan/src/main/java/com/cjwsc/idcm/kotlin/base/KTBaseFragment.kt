package foxidcw.android.idcw.common.base

import com.cjwsc.idcm.base.*

abstract class KTBaseFragment<M : BaseModel?,P : BasePresenter<out BaseView<*>, *>?>: BaseFragment<M, P>(){
}