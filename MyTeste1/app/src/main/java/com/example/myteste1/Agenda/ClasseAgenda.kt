package com.example.myteste1.Agenda

class ClasseAgenda(val nome: String, val idade: Int, val telefone: String) {
    fun verificatNomeVazil(): Boolean{
        return  nome == ""

    }
    fun verificarTelefone(): Boolean{
        return telefone == ""
    }

}
