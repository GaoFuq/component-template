package com.gfq.component_app_template.comb

import android.content.Context
import android.util.Log
import com.gfq.component_app_template.comb.service.IComponentBService
import com.gfq.component_app_template.comb.ui.ComponentBTestActivity
import com.google.auto.service.AutoService

/**
 * 对外接口实现类
 */
@AutoService(IComponentBService::class)
class ComponentBService : IComponentBService {
    override fun startComponentBTestActivity(context: Context) {
        Log.e("ComponentBService","startComponentBTestActivity")
        ComponentBTestActivity.start(context)
    }

}