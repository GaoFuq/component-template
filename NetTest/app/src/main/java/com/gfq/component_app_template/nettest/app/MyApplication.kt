package com.gfq.component_app_template.nettest.app

import android.app.Application
import android.content.Context
import android.util.Log
import com.like.component.BaseComponentApplication
import com.like.component.IModuleApplication
import java.util.logging.Logger
import javax.sql.CommonDataSource

class MyApplication  :IModuleApplication{
    override fun attachBaseContext(base: Context) {
        Logger.getAnonymousLogger().level
    }

    override fun onCreate(application: Application) {
    }

    override fun onTerminate(application: Application) {
    }

}