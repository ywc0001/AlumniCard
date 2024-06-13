package com.example.alumnicard

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.alumnicard.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //使用View Binding将activity_main.xml 布局文件和MainActivity绑定
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //获取底部导航栏控件
        val navView: BottomNavigationView = binding.navView
        //获取导航控制器
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        //指定顶级目的地的ID，用于在应用栏中显示标题
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        //设置ActionBar与导航控制器关联，以便在应用栏中显示导航标题
        setupActionBarWithNavController(navController, appBarConfiguration)
        //将底部导航栏控件与导航控制器关联，以便响应导航目的地切换
        navView.setupWithNavController(navController)
    }
}
















