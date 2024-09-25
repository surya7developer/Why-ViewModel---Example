package com.suresh.viewmodelexample

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.suresh.viewmodelexample.databinding.ActivityMainBinding
import com.suresh.viewmodelexample.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIncrement.setOnClickListener {
            mainViewModel.increment()
        }

        binding.btnClear.setOnClickListener {
            mainViewModel.clearData()
        }

        mainViewModel.getNumber().observe(this) {
            binding.txtNumbers.text = it.toString()
        }
    }
}