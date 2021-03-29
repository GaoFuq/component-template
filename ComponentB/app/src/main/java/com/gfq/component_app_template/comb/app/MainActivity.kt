package com.gfq.component_app_template.comb.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gfq.component_app_template.comb.service.IComponentBService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "ComB_测试APP"
    }

    fun jump(view: View) {
        IComponentBService.getInstance()?.startComponentBTestActivity(this)
    }
}