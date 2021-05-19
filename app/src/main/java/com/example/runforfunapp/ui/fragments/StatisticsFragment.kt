package com.example.runforfunapp.ui.fragments

import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.runforfunapp.R
import com.example.runforfunapp.ui.viewmodels.MainViewModel
import com.example.runforfunapp.ui.viewmodels.StatisticsViewModel

class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel : StatisticsViewModel by viewModels()
}