package com.hfad.gitpracticeyt4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("THIS IS CHANGED IN OUR SECOND COMMIT")
        println("LOCAL CHANGE")
        println("CHANGE 6")
        println("THIS LINE WILL BE MERGED")
        println("Hello from your friend")
        println("Second hello from your friend")
    }
}