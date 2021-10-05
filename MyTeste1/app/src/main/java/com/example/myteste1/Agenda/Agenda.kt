package com.example.myteste1.Agenda

class Agenda() {
    private var listaContatos = mutableListOf<ClasseAgenda>()
    private var  indiceAtual = 0

    fun salvarContato(novoContato: ClasseAgenda){
        listaContatos.add(novoContato)
    }
    fun imprimirNomeContato(): String{
        if (indiceAtual == listaContatos.size){
            indiceAtual = 0
        }
        val contatoAtual = listaContatos[indiceAtual]
        indiceAtual++
        return  "${contatoAtual.nome}"
    }
    fun imprimirTelefone(): String{
        indiceAtual -= 1
        if (indiceAtual == listaContatos.size){
            indiceAtual = 0
        }
        val contatoAtual = listaContatos[indiceAtual]
        indiceAtual++
        return "${contatoAtual.telefone}"
    }
    fun deletarContato(){
        if (indiceAtual >=1){
            indiceAtual -= 1

            val contatoAtual = listaContatos[indiceAtual]
            listaContatos.remove(contatoAtual)
        } else {
            val contatoAtual = listaContatos[indiceAtual]
            listaContatos.remove(contatoAtual)

        }

    }
    fun rertonarNumeroContato(): Int{
        return listaContatos.size
    }
}