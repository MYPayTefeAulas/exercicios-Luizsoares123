package com.example.myteste1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myteste1.databinding.ActivityCalculadoraBinding

class CalculadoraActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculadoraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCalculadoraBinding.inflate(layoutInflater)
        binding.btTrocaTexto.setOnClickListener {
  //          binding.txtHello.text = "Olá, my friend"
            binding.txtHello.text = calculadora()
        }



        val view = binding.root
        setContentView(view)
    }
 /*   fun calculadora(): String{
        var operacao = binding.txtOperacao.text.toString()
        val num1 = binding.txtNumero1.text.toString().toInt()
        val num2 = binding.txtNumero2.text.toString().toInt()
        var resultado = ""
        if (operacao == "+"){
            resultado = (num1 + num2).toString()
            return resultado.toString()
    }
        else if(operacao == "-"){
            resultado = (num1 - num2).toString()
            return resultado.toString()
        }
        else if (operacao == "*"){
            resultado = (num1 * num2).toString()
            return resultado.toString()
        }
        else if (operacao == "/"){
            resultado = (num1 / num2).toString()
            return resultado.toString()
        }
        else{
            resultado = "Operação não encontrada."
        }
        return  resultado.toString()

    }

  */

   fun calculadora(): String{
     var operacao = binding.txtOperacao.text.toString()
     val num1 = binding.txtNumero1.text.toString().toInt()
     val num2 = binding.txtNumero2.text.toString().toInt()
     var resultado = ""
     when (operacao){
         "+" -> resultado = (num1 + num2).toString()
         "-" -> resultado = (num1 - num2).toString()
         "*" -> resultado = (num1 * num2).toString()
         "/" -> resultado = (num1 / num2).toString()
         else -> resultado = "Operação não encontrada."
     }
     return  resultado.toString()

 }

}