package com.oriadesoftdev.videoplayer

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.oriadesoftdev.videoplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        initVideoView()
    }

    private fun initVideoView() {
        val mediaController = MediaController(this)
        binding.videoView.apply {
            mediaController.setAnchorView(this@apply)
            setMediaController(mediaController)
            setVideoURI(
                Uri.parse(
                    "android.resource://$packageName/raw/draw_any_polygon"))
            requestFocus()
        }.start()
    }
}