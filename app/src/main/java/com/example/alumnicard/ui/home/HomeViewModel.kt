package com.example.alumnicard.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//class HomeViewModel : ViewModel() {
//
//    private val _text = MutableLiveData<String>().apply {
//        value = "这是主页面（校友卡）\n" +
//                "将放置电子校友卡"
//
//    }
//    val text: LiveData<String> = _text
//}
class HomeViewModel : ViewModel() {

    private val _alumniCardInfo = MutableLiveData<AlumniCard>().apply {
        value = AlumniCard("12345678", "张三", "计算机科学与技术", "2020")
    }
    val alumniCardInfo: LiveData<AlumniCard> = _alumniCardInfo
}

data class AlumniCard(val studentID: String, val name: String, val college: String, val graduationYear: String)