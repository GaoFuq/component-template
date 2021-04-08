package com.gfq.component_app_template.coma.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.gfq.component_app_template.coma.ComponentAApplication
import com.gfq.component_app_template.coma.R
import com.gfq.component_app_template.coma.viewmodule.HomeVM
import kotlinx.android.synthetic.main.component_a_fragment_xx.*

class HomeFragment : Fragment() {
//    val homeVM:HomeVM = ViewModelProvider.AndroidViewModelF.create(HomeVM::class.java)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.component_a_fragment_xx, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tv.text = "Home"
    }
}