package com.example.alumnicard.ui.userpage

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//class UserPageViewModel : ViewModel() {
//
//    private val _text = MutableLiveData<String>().apply {
//        value = "这是校友个人账户页面\n" +
//                "包含一些个人设置"
//    }
//    val text: LiveData<String> = _text
//}
data class User(val username: String, val email: String, val phone: String)

class UserPageViewModel : ViewModel() {
    private val _userData = MutableLiveData<User>().apply {
        value = User("张三", "zhangsan@example.com", "123-456-7890")
    }
    val userData: LiveData<User> = _userData

}