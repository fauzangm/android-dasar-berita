package id.android.dasar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import id.android.dasar.R
import id.android.dasar.data.ModelBerita
import id.android.dasar.databinding.ActivityMainBinding
import splitties.activities.start
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    @Inject
    lateinit var adapter: BeritaAdapter
    lateinit var nama : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        try {
            initUi()
        } catch (e:Exception){
            e.printStackTrace()
        }
    }

    private fun initUi() {
        val modelBeritaArray = arrayListOf<ModelBerita>(ModelBerita("Poros","Succes"),ModelBerita("Dev","Frontend"))
        binding.rvBerita.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvBerita.adapter = adapter


        adapter.submitList(modelBeritaArray)

        binding.btnToDetail.setOnClickListener {
            start<MotionActivity>()
        }
    }
}