package com.security.exportedcomponentapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ExportedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exported)

        // Display a toast message when this exported activity is launched
        Toast.makeText(this, "Exported Activity Launched!", Toast.LENGTH_SHORT).show()
    }
}
