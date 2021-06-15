package com.example.runforfunapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.runforfunapp.R
import com.example.runforfunapp.other.Constants.ACTION_SHOW_TRACKING_FRAGMENT
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigateToTrackingFragmentIfNeeded(intent)

        setSupportActionBar(toolbar)

        bottomNavigationView.setupWithNavController(navHostFragment.findNavController())

        bottomNavigationView.setOnNavigationItemReselectedListener { /* NO_OP */ }

        navHostFragment.findNavController()
            .addOnDestinationChangedListener {_, destination, _ ->
                when(destination.id) {
                    R.id.runFragment, R.id.statisticsFragment, R.id.settingsFragment ->
                        bottomNavigationView.visibility = View.VISIBLE
                    else ->
                        bottomNavigationView.visibility = View.GONE
                }
            }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        navigateToTrackingFragmentIfNeeded(intent)
    }

private fun navigateToTrackingFragmentIfNeeded(intent: Intent?) {
    if(intent?.action == ACTION_SHOW_TRACKING_FRAGMENT) {
        navHostFragment.findNavController().navigate(R.id.action_global_trackingFragment)
    }
}

}