package com.JRobertFinal.footballapp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.JRobertFinal.footballapp.R
import com.JRobertFinal.footballapp.base.BaseActivity
import com.JRobertFinal.footballapp.ui.favorite.FavoriteFragment
import com.JRobertFinal.footballapp.ui.league.LeagueFragment
import com.JRobertFinal.footballapp.utils.replaceFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    companion object {
        // Function to start MainActivity from any context
        fun start(context: Context) {
            context.startActivity(
                Intent(context, MainActivity::class.java)
            )
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Replace the initial fragment with LeagueFragment
        replaceFragment(R.id.frameMain, LeagueFragment.newInstance(), false)

        bottomNavigation.apply {
            // Add icons to bottom navigation
            add(
                MeowBottomNavigation.Model(
                    1,
                    R.drawable.ic_ball_home
                )
            )
            add(
                MeowBottomNavigation.Model(
                    2,
                    R.drawable.ic_favorite
                )
            )
        }

        // Set listener to replace fragment when bottom navigation item is shown
        bottomNavigation.setOnShowListener {
            replaceFragment(R.id.frameMain, LeagueFragment.newInstance(), false)
        }

        // Show the first item in bottom navigation by default
        bottomNavigation.show(1)

        // Set listener to replace fragment when bottom navigation item is clicked
        bottomNavigation.setOnClickMenuListener {
            when (it.id) {
                // Replace fragment with LeagueFragment when first item is clicked
                1 -> {
                    replaceFragment(R.id.frameMain, LeagueFragment.newInstance(), false)
                }
                // Replace fragment with FavoriteFragment when second item is clicked
                2 -> {
                    replaceFragment(R.id.frameMain, FavoriteFragment.newInstance(), false)
                }
            }
        }
    }
}
