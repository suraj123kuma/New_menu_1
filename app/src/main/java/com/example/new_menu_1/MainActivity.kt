package com.example.new_menu_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPop = findViewById<Button>(R.id.button)
        val TextView = findViewById<TextView>(R.id.text)

        btnPop.setOnClickListener {

            val popMenu = PopupMenu(this, TextView)
            popMenu.menuInflater.inflate(R.menu.menu, popMenu.menu)
            popMenu.show()

            popMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {

                    R.id.Notifacion -> {
                        Toast.makeText(this,"Notifaction",Toast.LENGTH_SHORT).show()
                    }

                    R.id.setting -> {
                        Toast.makeText(this,"Setting",Toast.LENGTH_SHORT).show()
                    }

                    R.id.logout -> {
                        Toast.makeText(this,"Logout",Toast.LENGTH_SHORT).show()
                    }

                }
                true
            }

        }

    }
}