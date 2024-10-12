package com.example.maindash

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.maindash.SettingsFunctions.Appearance
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        drawerLayout = findViewById(R.id.drawer_layout)
        val navigationView: NavigationView = findViewById(R.id.nav_view)

        val imageButton: ImageButton = findViewById(R.id.setting)

        imageButton.setOnClickListener {
            if (!drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.openDrawer(GravityCompat.START)
            } else {
                drawerLayout.closeDrawer(GravityCompat.START)
            }
        }

        navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {

                R.id.nav_appearance -> { startActivity(Intent(this, Appearance::class.java)) }
                R.id.nav_readerSettings -> { /* Add kayo functionality */ }
                R.id.nav_bookmarks -> { /* Add kayo functionality */ }
                R.id.nav_dataAndPrivacy -> { /* Add kayo functionality */ }
                R.id.nav_language -> { /* Add kayo functionality */ }
                R.id.nav_writeUs -> { /* Add kayo functionality */ }
                R.id.nav_services -> { /* Add kayo functionality*/ }
                R.id.nav_about -> { /* Add kayo functionality */ }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
    }
}