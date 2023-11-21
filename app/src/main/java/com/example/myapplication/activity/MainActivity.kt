package com.example.myapplication.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.myapplication.R

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_weather)
    }
}

//private fun replaceFragment(fragment: Fragment) {
//    val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
//    fragmentTransaction.replace(R.id.holder_fl_main, fragment)
//    fragmentTransaction.commit()
//}
//
//private fun navigationItemSelect() {
//    binding.bnMain.run {
//        setOnItemSelectedListener { item ->
//            when(item.itemId) {
//                R.id.action_home -> replaceFragment(HomeFragment())
//                R.id.action_course -> replaceFragment(CourseFragment())
//                R.id.action_weather -> replaceFragment(WeatherFragment())
//                R.id.action_my -> replaceFragment(MyFragment())
//            }
//            true
//        }
//        selectedItemId = R.id.action_home
//    }
//}