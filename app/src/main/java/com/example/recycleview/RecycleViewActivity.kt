package com.example.recycleview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview.databinding.ActivityRecycleViewBinding

class RecycleViewActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRecycleViewBinding

    private var namelist:MutableList<SampleModel> =mutableListOf()
    private lateinit var sampleAdapter:SampleAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityRecycleViewBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        loadData()
        sampleAdapter= SampleAdapter(namelist)
        binding.apply{
            rcv.apply { layoutManager=LinearLayoutManager(this@RecycleViewActivity)
                adapter=sampleAdapter

            }

        }


    }


    private fun loadData(){
namelist.add(SampleModel(1,"sample title"))
namelist.add(SampleModel(2,"sample title2"))
namelist.add(SampleModel(3,"sample title3"))
namelist.add(SampleModel(4,"sample title4"))
namelist.add(SampleModel(5,"sample title5"))
namelist.add(SampleModel(6,"sample title6"))

    }
}