package com.gfq.component_app_template.common

import android.content.res.Resources
import android.util.TypedValue


inline val Float.dp: Float
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this,
        Resources.getSystem().displayMetrics
    )

inline val Int.dp: Int get() = this.toFloat().dp.toInt()

inline val Float.sp: Float
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_SP,
        this,
        Resources.getSystem().displayMetrics
    )

inline val Int.sp: Int get() = this.toFloat().sp.toInt()

fun dp2px(dpValue: Float): Float {
    return dpValue.dp
}

fun sp2px(spValue: Float): Float {
    return spValue.sp
}