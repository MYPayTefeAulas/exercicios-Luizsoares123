package com.example.myteste1.dado

class ClasseDados(val numeroDeLados: Int) {
    private var quantidadeDeLados = mutableListOf<Int>()
    private var i = 1

    fun lancarDados(): String {
        while (i <= numeroDeLados){
            quantidadeDeLados.add(i)
            i++
        }
        return  "${quantidadeDeLados.shuffled().first()}"

    }
}