package com.example.kabaddikounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kabaddikounter.databinding.ActivityMainBinding
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.kabaddikounter.databinding.ActivityMainBinding.inflate


class MainActivity : AppCompatActivity() {

    val viewModel: ScoreViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //changement du code pour utiliser le databinding
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.viewModel=viewModel
        binding.lifecycleOwner=this

        //mise à jour sans lifedata
        binding.btnPlus1TeamA.setOnClickListener(){
            viewModel.incrementA(true,1)
            binding.txtScoreTeamA.text = viewModel.scoreA.toString()
        }

        binding.btnPlus2TeamA.setOnClickListener {
            viewModel.incrementA(true,2)
            binding.txtScoreTeamA.text = viewModel.scoreA.toString()
        }

        //mise à jour avec lifedata
        binding.btnPlus1TeamB.setOnClickListener(){
            viewModel.incrementA(false,1)
        }
        binding.btnPlus2TeamB.setOnClickListener {
            viewModel.incrementA(false,2)
        }
    }
}