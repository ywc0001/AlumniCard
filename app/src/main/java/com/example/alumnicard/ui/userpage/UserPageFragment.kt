package com.example.alumnicard.ui.userpage

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.alumnicard.databinding.FragmentNotificationsBinding


class UserPageFragment : Fragment() {

//    private var _binding: FragmentNotificationsBinding? = null
//
//    // This property is only valid between onCreateView and
//    // onDestroyView.
//    private val binding get() = _binding!!

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        val userPageViewModel =
//            ViewModelProvider(this).get(UserPageViewModel::class.java)
//
//        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
//        val root: View = binding.root
//
//        val textView: TextView = binding.textNotifications
//        userPageViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
//        return root
//    }
    private var _binding:  FragmentNotificationsBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: UserPageViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(UserPageViewModel::class.java)

        viewModel.userData.observe(viewLifecycleOwner) { user ->
            binding.tvUsername.text = user.username
            binding.tvEmail.text = user.email
            binding.tvPhone.text = user.phone
        }

        binding.btnEditProfile.setOnClickListener {
            // 跳转到编辑资料页面
        }

        binding.btnViewHistory.setOnClickListener {
            // 跳转到历史记录页面
        }

        binding.btnChangePassword.setOnClickListener {
            // 跳转到更改密码页面
        }

        binding.btnLogout.setOnClickListener {
//            val intent = Intent(activity, LoginActivity::class.java)
//            startActivity(intent)
            activity?.finish()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}