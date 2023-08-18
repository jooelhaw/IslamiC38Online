package com.route.isalmic38online.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.route.isalmic38online.R
import com.route.isalmic38online.databinding.ActivityContentBinding
import java.io.IOException
import java.io.InputStream

class ContentActivity : AppCompatActivity() {
    lateinit var viewBinding: ActivityContentBinding
    private var surahNumber: Int? = null
    private var surahName: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityContentBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        surahNumber = intent?.getIntExtra("surah",0)
        surahName = intent?.getStringExtra("name")
        viewBinding.tvHeadOfContent.text = surahName.toString()
        try {
            val inputStream: InputStream = assets.open("${surahNumber}.txt")
            val size: Int = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            viewBinding.tvContent.text = String(buffer)

        }catch (e: IOException){
            e.printStackTrace()
            viewBinding.tvContent.text = "Sorry No Such file of directory"
        }

    }
}