package com.example.runforfunapp.ui.fragments

import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.runforfunapp.R
import com.example.runforfunapp.ui.viewmodels.MainViewModel

class RunFragment : Fragment(R.layout.fragment_run) {

    private val viewModel : MainViewModel by viewModels()
}