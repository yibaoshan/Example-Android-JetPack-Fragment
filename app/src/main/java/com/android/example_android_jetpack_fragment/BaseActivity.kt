package com.android.example_android_jetpack_fragment

import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    protected fun createButtonView(text: String, onClickListener: View.OnClickListener): Button {
        val button = Button(this)
        button.text = text
        button.setOnClickListener(onClickListener)
        return button
    }

}