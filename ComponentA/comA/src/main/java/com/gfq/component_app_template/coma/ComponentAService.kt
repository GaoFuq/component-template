package com.gfq.component_app_template.coma

import android.content.Context
import android.util.Log
import androidx.fragment.app.Fragment
import com.gfq.component_app_template.coma.service.IComponentAService
import com.gfq.component_app_template.coma.ui.ComponentATestActivity
import com.gfq.component_app_template.coma.ui.HomeFragment
import com.google.auto.service.AutoService

/**
 * 对外接口实现类
 */
@AutoService(IComponentAService::class)
class ComponentAService : IComponentAService {
    override fun startComponentATestActivity(context: Context) {
        Log.e("ComponentAService", "startComponentATestActivity")
        ComponentATestActivity.start(context)
    }

    override fun getHomeFragment(): Fragment {
        return HomeFragment()
    }


}