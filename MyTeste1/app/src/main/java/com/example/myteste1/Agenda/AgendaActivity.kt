package com.example.myteste1.Agenda

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myteste1.databinding.ActivityAgendaBinding

class AgendaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAgendaBinding
    private  val agenda = Agenda()

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)

        binding = ActivityAgendaBinding.inflate(layoutInflater)
        binding.btSalvar.setOnClickListener {
            val nome = binding.txtNome.text.toString()
            val telefone = binding.txtTelefone.text.toString()
            val novoContato = ClasseAgenda(nome,0, telefone)

            if(novoContato.verificatNomeVazil() &&novoContato.verificarTelefone()){
                binding.txtSaida.text = "Erro!! Por favor digite um nome e um número de telefone."
            }else if (novoContato.verificatNomeVazil()){
                binding.txtSaida.text = "Erro!! Por favor digite um nome"
            }else if (novoContato.verificarTelefone()){
                binding.txtSaida.text = "Erro!! Por favor digite um número de telefone"
            } else if (agenda.testarRepetiçaoContato(novoContato)){
                binding.txtSaida.text = "Erro!! Contato já existe"

            }else{
                binding.txtNome.setText("")
                binding.txtTelefone.setText("")
                agenda.salvarContato(novoContato)
                binding.txtSaida.text = "Contato Salvo:\n nome:${nome}\ntelefone:${telefone} "

            }



        }
        binding.btProximo.setOnClickListener {
            if (agenda.checarListaDeContato()){
                binding.txtSaida.text = "Nenhum contato para imprimir!!"
            }else{

                binding.txtNome.setText(agenda.imprimirNomeContato())
                binding.txtTelefone.setText(agenda.imprimirTelefone())
            }


        }
        binding.btDeletar.setOnClickListener {
            if (agenda.rertonarNumeroContato() == 0){
                binding.txtSaida.setTextColor(Color.rgb(200,10,10))
                binding.txtSaida.text = "Agenda Vazia"

            }else agenda.deletarContato()
            binding.txtNome.text.clear()
            binding.txtTelefone.text.clear()
        }
        binding.btBotaoPesquisar.setOnClickListener {
            val nomePesquisar = binding.txtEntradaNomeDaPesquisa.text.toString()
            val pessoaPesquisar = ClasseAgenda(nomePesquisar, 0,"")
            if (agenda.checarListaDeContato()){
                binding.txtSaida.text = "Erro!!! Nenhum contato salvo."
            }else if (agenda.testarRepetiçaoNome(pessoaPesquisar) == false){
                binding.txtSaida.text = "Erro!!! Contato não encontrado!!!"
            }else{
                binding.txtSaida.text = "Contato Encontrado"
            }

        }


        setContentView(binding.root)
    }
}