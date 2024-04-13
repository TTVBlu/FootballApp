package com.JRobertFinal.footballapp.base

import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment

// Base class for all fragments in the application
abstract class BaseFragment : Fragment() {

    // Reference to the BaseActivity associated with this fragment
    private var baseActivity: BaseActivity? = null

    // Function to set up the toolbar for the fragment
    fun setupToolbar(toolbar: Toolbar?, title: String, isChild: Boolean) {
        // Delegate the toolbar setup to the associated BaseActivity
        baseActivity?.setupToolbar(toolbar, title, isChild)
    }
}
