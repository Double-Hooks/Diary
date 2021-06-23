package com.doublehook.diary

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.doublehook.diary.databinding.ActivityMainBinding
import com.doublehook.diary.model.Post
import com.doublehook.diary.view.TimelineActivity

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.button.setOnClickListener {
            val intent = Intent(this, TimelineActivity::class.java)
            startActivity(intent)
        }
    }
}