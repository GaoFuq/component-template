package com.gfq.component_app_template.common

import android.content.res.Resources
import android.graphics.Color
import android.graphics.drawable.Drawable
import androidx.core.content.res.ResourcesCompat

fun getColor(resIdOrStr: Any): Int {
    return when (resIdOrStr) {
        is Int -> Resources.getSystem().getColor(resIdOrStr, null)
        is String -> Color.parseColor(resIdOrStr)
        else -> Color.TRANSPARENT
    }
}

fun getDrawable(resId: Int): Drawable? {
    return ResourcesCompat.getDrawable(Resources.getSystem(), resId, null)
}

fun getString(resIdOrStr: Any, vararg format: Any?): String {
    return when (resIdOrStr) {
        is Int -> Resources.getSystem().getString(resIdOrStr, format)
        is String -> resIdOrStr
        else -> resIdOrStr.toString()
    }
}