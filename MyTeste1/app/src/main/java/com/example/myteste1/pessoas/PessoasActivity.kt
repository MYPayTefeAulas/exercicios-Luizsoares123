package com.example.myteste1.pessoas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myteste1.databinding.ActivityPessoasBinding

class PessoasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPessoasBinding

    private var nome = ""
    private var idade = 0
    private val listaPessoas = mutableListOf<Pessoa>()
    private var indiceAtual = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPessoasBinding.inflate(layoutInflater)
        binding.btImprimir.setOnClickListener {
            binding.txtSaida.text = imprimirPessoa()
        }
        binding.btSalvar.setOnClickListener {
            nome = binding.txtNome.text.toString()
            binding.txtNome.text.clear()
            idade = binding.txtIdade.text.toString().toInt()
            binding.txtIdade.text.clear()

 //           val pessoa = Pessoa(nome,idade)
 //           listaPessoas.add(pessoa)
        }

        setContentView(binding.root)
    }
    fun imprimirPessoa(): String{
        //Caso finalize a list,mostrar Fim.
        //novo botão: Do começo
        if (indiceAtual >= listaPessoas.size)
            indiceAtual = 0
        val pessoasAtual = listaPessoas[indiceAtual]
        indiceAtual++
        return  "Nome: ${pessoasAtual.nome}, Indade: ${pessoasAtual.idade}"
    }
    fun imprimirNomeContato(){

    }
    fun imprimirTelefoneContatos(){

    }
}