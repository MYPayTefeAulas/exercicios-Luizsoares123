package com.example.myteste1

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myteste1.databinding.ActivityDadosBinding

class DadosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDadosBinding
    private val dados1 = ClasseDados(4)
    private val dados2 = ClasseDados(6)
    private val dados3 = ClasseDados(8)
    private val lados4 = ClasseDados(10)
    private val listaDeDados = mutableListOf<ClasseDados>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDadosBinding.inflate(layoutInflater)
        listaDeDados.add(dados1)
        binding.btSortear.setOnClickListener {
            binding.txtQuantidadeLados1.text = "${dados1.numeroDeLados}"
            binding.txtQuantidadeLados2.text = "${dados2.numeroDeLados}"
            binding.txtQuantidadeLados3.text = "${dados3.numeroDeLados}"

            binding.txtNumeroDados1.text = dados1.lancarDados()
            binding.txtNumeroDados2.text = dados2.lancarDados()
            binding.txtNumeroDados3.text = dados3.lancarDados()
        }

        setContentView(binding.root)
    }
}