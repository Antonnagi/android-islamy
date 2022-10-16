package com.example.islamy.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.islamy.R
import com.example.islamy.ui.home.fragment.HadethFragment
import com.example.islamy.ui.home.fragment.QuranFragment
import com.example.islamy.ui.home.fragment.RadioFragment
import com.example.islamy.ui.home.fragment.SebhaFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class HomeActivity : AppCompatActivity() {
    lateinit var bottomNavigation:BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        bottomNavigation=findViewById(R.id.NavigationBar)
        bottomNavigation.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener {
            menuItem->
        if (menuItem.itemId==R.id.navigation_quran){
            pushFragment(QuranFragment())
        }else if(menuItem.itemId==R.id.navigation_hadeath){
            pushFragment(HadethFragment())

        }else if(menuItem.itemId==R.id.navigation_sabha){
              pushFragment(SebhaFragment())
        }else if(menuItem.itemId==R.id.navigation_radio){
            pushFragment(RadioFragment())
        }
            return@OnItemSelectedListener true
    })
        bottomNavigation.selectedItemId=R.id.navigation_quran

    }

    private fun pushFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

}