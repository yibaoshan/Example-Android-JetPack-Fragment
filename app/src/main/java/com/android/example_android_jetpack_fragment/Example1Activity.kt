package com.android.example_android_jetpack_fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by yibaoshan@foxmail.com on 2021/11/22
 * Description : 在xml中使用<fragment>标签创建Fragment
 * 关于fragment标签加载过程分析，请查看：https://github.com/RTFSC-Android/RTFSC/blob/master/LayoutInflater-3.md
 */
class Example1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "$title-XML"
        setContentView(R.layout.activity_example1)
    }

}