package com.doublehook.diary.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.doublehook.diary.databinding.ActivityTimelineBinding
import com.doublehook.diary.model.Post
import com.doublehook.diary.view.adapter.TimelineAdapter

class TimelineActivity : AppCompatActivity() {
    private val binding by lazy { ActivityTimelineBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val testData = ArrayList<Post>()
        testData.add(Post("asd"))

        binding.timeline.adapter = TimelineAdapter(testData)
    }
}