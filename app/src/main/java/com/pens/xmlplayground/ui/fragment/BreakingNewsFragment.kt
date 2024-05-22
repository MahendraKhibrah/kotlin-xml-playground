package com.pens.xmlplayground.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.pens.xmlplayground.R
import com.pens.xmlplayground.databinding.FragmentBreakingNewsBinding

class BreakingNewsFragment : Fragment(R.layout.fragment_breaking_news) {

    private lateinit var binding : FragmentBreakingNewsBinding

    private val args by navArgs<BreakingNewsFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBreakingNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            button1.setOnClickListener {
                findNavController().navigateUp()
            }
            button1.text = "Button 2 hehe"
            tvAge.text = args.age.toString()
            textView.text = args.name
        }
    }

}