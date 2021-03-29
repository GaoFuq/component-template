package com.gfq.component_app_template.comb.service

import android.content.Context
import java.util.*

/**
 * 对外开放的接口
 */
interface IComponentBService {
    companion object {
        fun getInstance(): IComponentBService? = Holder.instance
    }

    private object Holder {
        val iterator = ServiceLoader.load(IComponentBService::class.java).iterator()
        val instance = if (iterator.hasNext()) {
            iterator.next()
        } else {
            null
        }
    }

    fun startComponentBTestActivity(context: Context)

}