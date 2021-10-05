package com.example.myteste1.greeters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myteste1.databinding.ActivityGreeter12Binding

class GreeterActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityGreeter12Binding
    private val listaNomes = mutableListOf<String>()
    private var indiceAtual = 0
 //   private var greeterAtual = 1
    private lateinit var greeterAtual : Greeter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGreeter12Binding.inflate(layoutInflater)
//--------------------------------------------------------------
       // configuração de variaveis "globais" da tela
        val greeter1 = Greeter("Olá")
        val greeter2 = Greeter("Bem vindo")
        val greeter3 = Greeter("Oi")
        greeterAtual = greeter1
        listaNomes.add("Luiz")
        listaNomes.add("Alex")
        listaNomes.add("Rodrigo")
        listaNomes.add("José")


//--------------------------------------------------------------

        // configuração dos botões


        binding.btImprimir.setOnClickListener {
            val nomeAtual = listaNomes[indiceAtual]
 //           binding.txtSaida.text = greeter1.greet(nomeAtual)
            binding.txtSaida.text = greeterAtual.greet(nomeAtual)

//            when (greeterAtual){
//                1 -> binding.txtSaida.text = greeter1.greet(nomeAtual)
//                2 -> binding.txtSaida.text = greeter2.greet(nomeAtual)
//            }


            if (indiceAtual == listaNomes.size - 1){
                indiceAtual = 0
            }else{
                indiceAtual++
            }
        }

        binding.btTrocar.setOnClickListener {
            if(greeterAtual == greeter1){
                greeterAtual = greeter2
                binding.txtNumeroGreeter.text = "2"

            }else if(greeterAtual == greeter2){
                greeterAtual = greeter3
                binding.txtNumeroGreeter.text = "3"

            }else{
                greeterAtual = greeter1
                binding.txtNumeroGreeter.text = "1"
            }
        }

        setContentView(binding.root)
    }
}