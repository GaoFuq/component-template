package com.gfq.component_app_template.common

import android.annotation.SuppressLint
import android.content.Context
import android.os.Looper
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.annotation.DrawableRes


/**
 * DATE_TIME 2021/2/7
 * AUTH gaofuq
 * DESCRIPTION
 */
object CommonToast {
    private var lastToast: Toast? = null

    @SuppressLint("ShowToast")
    private fun createToast(context: Context, msg: Any, resId: Int): Toast {
        /* val binding: CommonToastWithImgBinding = DataBindingUtil.inflate(
             LayoutInflater.from(CommonApplication.sInstance),
             R.layout.common_toast_with_img,
             null,
             false
         )*/
        /* if (resId != 0) {
             binding.ivToastImg.setImageResource(resId)
             binding.ivToastImg.visibility = View.VISIBLE
         }
         binding.tvToastMsg.text = when (msg) {
             is CharSequence -> msg
             is Int -> CommonApplication.sInstance.getString(msg)
             else -> msg.toString()
         }*/
        if (lastToast != null) {
            lastToast!!.cancel()
        }
        val currentToast = Toast.makeText(context, "", Toast.LENGTH_SHORT)
        lastToast = currentToast
//        currentToast.view = binding.root
        currentToast.setGravity(Gravity.CENTER, 0, 0)
        return currentToast
    }


    fun show(context: Context, msg: Any) {
        mainThread { createToast(context, getString(msg, null), 0).show() }
    }

    /* fun showMsg(msg: Any) {
         runOnUiThread { createToast(msg, 0).show() }
     }

     fun showWarning(errorMsg: Any, @DrawableRes icResId: Int = R.drawable.common_ic_toast_warning) {
         runOnUiThread { createToast(errorMsg, icResId).show() }
     }

     fun showSuccess(successMsg: Any, @DrawableRes icResId: Int = R.drawable.common_ic_toast_success) {
         runOnUiThread { createToast(successMsg, icResId).show() }
     }

     fun showFailed(failedMsg: Any, @DrawableRes icResId: Int = R.drawable.common_ic_toast_failure) {
         runOnUiThread { createToast(failedMsg, icResId).show() }
     }

     fun showLoading(loadingMsg: Any, @DrawableRes icResId: Int = R.drawable.common_ic_toast_loading) {
         runOnUiThread { createToast(loadingMsg, icResId).show() }
     }*/

    fun cancel() {
        lastToast?.cancel()
    }


}