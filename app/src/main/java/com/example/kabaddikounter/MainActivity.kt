package com.example.kabaddikounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kabaddikounter.databinding.ActivityMainBinding
import androidx.activity.viewModels
import com.example.kabaddikounter.databinding.ActivityMainBinding.inflate


class MainActivity : AppCompatActivity() {
    lateinit  var binding : ActivityMainBinding
    val viewModel: ScoreViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(this.layoutInflater)
        setContentView(binding.root)

        var scoreB = 0
        binding.btnPlus1TeamA.setOnClickListener(){
            viewModel.incrementA(true,1)
            binding.txtScoreTeamA.text = viewModel.scoreA.toString()
        }

        binding.btnPlus2TeamA.setOnClickListener {
            viewModel.incrementA(true,2)
            binding.txtScoreTeamA.text = viewModel.scoreA.toString()
        }


    }
}