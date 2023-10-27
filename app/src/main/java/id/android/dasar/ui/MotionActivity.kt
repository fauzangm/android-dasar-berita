package id.android.dasar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import id.android.dasar.R
import id.android.dasar.databinding.ActivityMotionBinding

class MotionActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMotionBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMotionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        try {
            initUi()
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    private fun initUi() {

        binding.ivBack.setOnClickListener {
            onBackPressed()
        }

    }
}