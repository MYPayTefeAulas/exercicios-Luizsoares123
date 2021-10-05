package com.example.myteste1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myteste1.databinding.ActivityTelaInicialBinding
import com.example.myteste1.greeters.GreeterActivity

class TelaInicialActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTelaInicialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaInicialBinding.inflate(layoutInflater)
        binding.btAbrirExercListaPessoas.setOnClickListener {
            val intent = Intent(this, AgendaActivity::class.java)
            startActivity(intent)
        }
        binding.btAbrirExercListaFrutas.setOnClickListener {
            val intent = Intent(this, ListaFrutas::class.java)
            startActivity(intent)
        }
        binding.btAbrirExercGreeters.setOnClickListener {
            val intent = Intent(this, GreeterActivity::class.java)
            startActivity(intent)
        }
        binding.btAbrirCalculadora.setOnClickListener {
            val intent = Intent(this, CalculadoraActivity::class.java)
            startActivity(intent)

        }
        binding.btAbrirPessoas.setOnClickListener {
            val intent = Intent(this, PessoasActivity::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }
}