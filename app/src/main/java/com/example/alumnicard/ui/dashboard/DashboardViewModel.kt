package com.example.alumnicard.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
class DashboardViewModel : ViewModel() {

    private val _newsItems = MutableLiveData<List<NewsItem>>().apply {
        value = listOf(
            // 添加一些示例数据
            NewsItem("陈雨露调研医学院", "http://news.nankai.edu.cn/pic/003/000/654/00300065444_8a95312d.jpg"),
            NewsItem("南开大学与弗林德斯大学合作办学再结硕果", "https://example.com/thumbnail2.jpg"),
            // 更多新闻项...
            NewsItem("中国式现代化与地方政府发展论坛在南开大学举办", "http://news.nankai.edu.cn/pic/003/000/654/00300065429_51812bc6.png"),
            NewsItem("南开大学京剧团与台北京剧团在校联袂演出", "http://news.nankai.edu.cn/pic/003/000/653/00300065384_b3775081.jpg"),
            NewsItem("中国叙事文化学国际学术研讨会在南开大学举办", "http://news.nankai.edu.cn/pic/003/000/653/00300065357_e9936edc.jpg"),
            NewsItem("话剧《周恩来回南开》首演师生座谈会召开", "http://news.nankai.edu.cn/pic/003/000/653/00300065384_b3775081.jpg"),
            NewsItem("南开大学河间乡村工作站推进外语教学", "http://news.nankai.edu.cn/pic/003/000/654/00300065429_51812bc6.png"),
            NewsItem("南开龙舟队端午多地出征获得佳绩", "http://news.nankai.edu.cn/pic/003/000/653/00300065384_b3775081.jpg"),
            NewsItem("国乐相声协会毕业生相声专场演出举办", "http://news.nankai.edu.cn/pic/003/000/654/00300065429_51812bc6.png"),
            NewsItem("外国语学院开展“独乐乐不如‘粽’乐乐”主题师生共建活动", "http://news.nankai.edu.cn/pic/003/000/653/00300065384_b3775081.jpg"),


            )
    }
    val newsItems: LiveData<List<NewsItem>> = _newsItems
}
//class DashboardViewModel : ViewModel() {
//
//    private val _text = MutableLiveData<String>().apply {
//        value = "这是其他功能页面"
//    }
//    val text: LiveData<String> = _text
//}