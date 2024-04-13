package com.JRobertFinal.footballapp.base

import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

// Base class for all activities in the application
abstract class BaseActivity : AppCompatActivity() {

    // Function to set up the toolbar for the activity
    fun setupToolbar(toolbar: Toolbar?, title: String, isChild: Boolean) {
        toolbar?.let {
            // Set the toolbar as the action bar
            setSupportActionBar(toolbar)
        }

        // Set the title and enable the back button on the action bar
        if (supportActionBar != null) {
            supportActionBar!!.title = title
            supportActionBar!!.setDisplayHomeAsUpEnabled(isChild)
        }
    }

    // Function to handle menu item selection
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle the back button press
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}
