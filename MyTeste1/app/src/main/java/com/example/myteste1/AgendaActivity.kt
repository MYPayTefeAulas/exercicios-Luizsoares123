package com.example.myteste1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myteste1.databinding.ActivityAgendaBinding
import com.example.myteste1.databinding.ActivityMainBinding

class AgendaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAgendaBinding
    private  val agenda = Agenda()

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)

        binding = ActivityAgendaBinding.inflate(layoutInflater)
        binding.btSalvar.setOnClickListener {
            val nome = binding.txtNome.text.toString()
            val telefone = binding.txtTelefone.text.toString()
            val novoContato = Pessoa(nome,0, telefone)
            agenda.salvarContato(novoContato)
        }
        binding.btProximo.setOnClickListener {
            binding.txtNome.setText(agenda.imprimirNomeContato())
            binding.txtTelefone.setText(agenda.imprimirTelefone())
        }
        binding.btDeletar.setOnClickListener {
            if (agenda.rertonarNumeroContato() == 0){
                binding.txtSaida.setTextColor(Color.rgb(200,10,10))
                binding.txtSaida.text = "Agenda Vazia"

            }else agenda.deletarContato()
            binding.txtNome.text.clear()
            binding.txtTelefone.text.clear()
        }


        setContentView(binding.root)
    }
}