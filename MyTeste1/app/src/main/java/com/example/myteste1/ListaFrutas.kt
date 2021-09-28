package com.example.myteste1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myteste1.databinding.ActivityLista2Binding

class ListaFrutas : AppCompatActivity() {
    private lateinit var binding: ActivityLista2Binding

    private val Listafrutas = listOf("maçã", "mamão", "abacate")
    private val ListaVegetais = listOf("pepino", "alface", "pimentão")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLista2Binding.inflate(layoutInflater)

        binding.btAnalisar.setOnClickListener {
            binding.textSaida.text = analisar(binding.txtEntrada.text.toString())
        }

        setContentView(binding.root)
    }

    fun analisar(entrada: String): String {
        var saida = ""
   //     var encontrouAlimento = false

        for (fruta in Listafrutas) {
            if (fruta == entrada) {
                saida = "É uma fruta"
  //              encontrouAlimento = true
            }
            break
        }
        for (vegetal in ListaVegetais) {
            if (vegetal == entrada) {
                saida = "É um vegetal"
 //               encontrouAlimento = true
            }
            break
        }
  //      if (encontrouAlimento)
            saida = "Não sei o que é isso"
        return saida
    }
}