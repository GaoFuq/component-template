package com.gfq.component_app_template.coma.service

import android.content.Context
import java.util.*

/**
 * 对外开放的接口
 */
interface IComponentAService {
    companion object {
        fun getInstance(): IComponentAService? = Holder.instance
    }

    private object Holder {
        val iterator = ServiceLoader.load(IComponentAService::class.java).iterator()
        val instance = if (iterator.hasNext()) {
            iterator.next()
        } else {
            null
        }
    }

    fun startComponentATestActivity(context: Context)

}