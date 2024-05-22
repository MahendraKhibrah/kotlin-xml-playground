package com.pens.xmlplayground.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.pens.xmlplayground.R
import com.pens.xmlplayground.databinding.FragmentArticleBinding

class ArticleFragment : Fragment(R.layout.fragment_article) {

    private lateinit var binding: FragmentArticleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentArticleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            button1.setOnClickListener {
                Log.d("ArticleFragment", "Button 1 clicked")
                val direction = ArticleFragmentDirections.actionArticleFragmentToBreakingNewsFragment2(name = "Pens", age = 20)
                findNavController().navigate(direction)
            }
            button1.text = "Button 1 hehe"
        }
    }
}