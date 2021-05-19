package com.example.runforfunapp.ui.fragments

import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.runforfunapp.R
import com.example.runforfunapp.ui.viewmodels.MainViewModel

class TrackingFragment : Fragment(R.layout.fragment_tracking) {

    private val viewModel : MainViewModel by viewModels()
}