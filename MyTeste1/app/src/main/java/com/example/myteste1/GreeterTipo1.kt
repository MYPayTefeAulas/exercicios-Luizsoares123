package com.example.myteste1

class GreeterTipo1(val cumprimento: String) {
    fun greet(nome: String): String{
        val cumprimentoCompleto = "$cumprimento, $nome"
        return cumprimentoCompleto
    }
}