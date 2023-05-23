package com.example.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kalkulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

//    var angka1 = binding.etAngka1.text.toString().toInt()
//    var angka2 = binding.etAngka2.text.toString().toInt()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btnTambah.setOnClickListener(){
            tambah()
        }
        binding.btnKurang.setOnClickListener(){
            kurang()
        }
        binding.btnKali.setOnClickListener(){
            kali()
        }
        binding.btnBagi.setOnClickListener(){
            bagi()
        }
        binding.btnClear.setOnClickListener(){
            clear()
        }
        setContentView(binding.root)
    }

    private fun tambah() {
        var angka1 = binding.etAngka1.text.toString().toInt()
        var angka2 = binding.etAngka2.text.toString().toInt()
        var hasil = angka1 + angka2
        binding.tvHasil.setText("$angka1 + $angka2 = $hasil")
//        binding.tvHasil.text = hasil.toString()

    }
    private fun kurang (){
        var angka1 = binding.etAngka1.text.toString().toInt()
        var angka2 = binding.etAngka2.text.toString().toInt()
        var hasil = angka1 - angka2
//        binding.tvHasil.text = hasil.toString()
        binding.tvHasil.setText("$angka1 - $angka2 = $hasil")
    }
    private fun kali (){
        var angka1 = binding.etAngka1.text.toString().toInt()
        var angka2 = binding.etAngka2.text.toString().toInt()
        var hasil = angka1 * angka2
        binding.tvHasil.setText("$angka1 x $angka2 = $hasil")
//        binding.tvHasil.text = hasil.toString()
    }

    private fun bagi (){
        var angka1 = binding.etAngka1.text.toString().toDouble()
        var angka2 = binding.etAngka2.text.toString().toDouble()
        var hasil = angka1 / angka2
        binding.tvHasil.setText("$angka1 / $angka2 = $hasil")
//        binding.tvHasil.text = hasil.toString()
    }
    private fun clear (){
        binding.tvHasil.setText("Hasil")
        binding.etAngka1.text.clear()
        binding.etAngka2.text.clear()
    }
}