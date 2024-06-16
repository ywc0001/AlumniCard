package com.example.alumnicard.ui.home

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.alumnicard.databinding.ActivityFillFormBinding

class FillFormActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityFillFormBinding

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityFillFormBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        binding.btnSubmit.setOnClickListener {
//            // 处理表单提交逻辑
//        }
//    }
private lateinit var binding: ActivityFillFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFillFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 其他初始化代码...
        // 获取表单控件
        val etEntryTime: EditText = binding.etEntryTime
        val etCampus: EditText = binding.etCampus
        val cbDriving: CheckBox = binding.cbDriving
        val cbWithFriends: CheckBox = binding.cbWithFriends
        val btnSubmit: Button = binding.btnSubmit
        val tvSuccessMessage: TextView = binding.tvSuccessMessage

        // 设置提交按钮点击事件
        btnSubmit.setOnClickListener {
            val entryTime = etEntryTime.text.toString()
            val campus = etCampus.text.toString()
            val driving = cbDriving.isChecked
            val withFriends = cbWithFriends.isChecked

            // 验证表单数据
            if (entryTime.isEmpty() || campus.isEmpty()) {
                Toast.makeText(this, "请填写所有必填项", Toast.LENGTH_SHORT).show()
            } else {
                // 处理表单数据（这里可以添加提交表单数据的逻辑）

                // 显示预约成功消息
                tvSuccessMessage.text = "预约成功"
                tvSuccessMessage.visibility = View.VISIBLE
            }
        }
    }
}
