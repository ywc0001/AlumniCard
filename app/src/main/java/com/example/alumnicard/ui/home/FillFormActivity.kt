package com.example.alumnicard.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alumnicard.databinding.ActivityFillFormBinding

class FillFormActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFillFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFillFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            // 处理表单提交逻辑
        }
    }
}