package com.example.alumnicard.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.alumnicard.R
import com.example.alumnicard.databinding.FragmentHomeBinding
import com.example.alumnicard.databinding.ItemAlumniCardBinding

class HomeFragment : Fragment() {

//    private var _binding: FragmentHomeBinding? = null
//
//    // This property is only valid between onCreateView and
//    // onDestroyView.
//    private val binding get() = _binding!!
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        val homeViewModel =
//            ViewModelProvider(this).get(HomeViewModel::class.java)
//
//        _binding = FragmentHomeBinding.inflate(inflater, container, false)
//        val root: View = binding.root
//
//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
//        return root
//    }

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Binding alumni card view
        val alumniCardBinding = ItemAlumniCardBinding.bind(binding.alumniCard.root)

        homeViewModel.alumniCardInfo.observe(viewLifecycleOwner) { cardInfo ->
            alumniCardBinding.tvStudentID.text = "学号: ${cardInfo.studentID}"
            alumniCardBinding.tvName.text = "姓名: ${cardInfo.name}"
            alumniCardBinding.tvCollege.text = "学院: ${cardInfo.college}"
            alumniCardBinding.tvGraduationYear.text = "毕业年份: ${cardInfo.graduationYear}"
        }

        binding.btnFillForm.setOnClickListener {
            val intent = Intent(activity, FillFormActivity::class.java)
            startActivity(intent)
        }
        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}