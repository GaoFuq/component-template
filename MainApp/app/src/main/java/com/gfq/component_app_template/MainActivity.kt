package com.gfq.component_app_template

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.gfq.component_app_template.coma.service.IComponentAService
import com.gfq.component_app_template.common.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun jump2ComponentAPage(view: View) {
//        CommonToast.show("xxx")
        IComponentAService.getInstance()?.startComponentATestActivity(this)
//        CommonToast.show(this,"xxx")

"xxx".toast()

        Logger.e("xxxxx")

    }

    fun String?.toast(){
        mainThread { Toast.makeText(this@MainActivity,this, Toast.LENGTH_SHORT).show() }
    }
}


