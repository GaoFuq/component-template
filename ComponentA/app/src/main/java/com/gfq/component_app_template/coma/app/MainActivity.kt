package com.gfq.component_app_template.coma.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gfq.component_app_template.coma.service.IComASerChild
import com.gfq.component_app_template.coma.service.IComponentAService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "ComA_测试APP"
    }

    fun jump(view: View) {
        IComponentAService.getInstance()?.startComponentATestActivity(this)
    }
}