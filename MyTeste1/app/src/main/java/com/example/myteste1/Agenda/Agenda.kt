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
    fun checarListaDeContato(): Boolean{

     return listaContatos.isEmpty()

    }









    fun testarRepetiçaoContato(contato: ClasseAgenda): Boolean{

        var resultado : Boolean = false
        for (lista in listaContatos){
            if (lista.telefone == contato.telefone){
                resultado = true
                break
            }
        }
        return resultado
    }
    fun testarRepetiçaoNome(contato: ClasseAgenda): Boolean{

        var resultado : Boolean = false
        for (lista in listaContatos){
            if (lista.nome == contato.nome){
                resultado = true
                break
            }
        }
        return resultado
    }
    fun imprimirNomeContatoPesquisa(contato: ClasseAgenda): String{
        var encontrou : String = ""

        for (lista in listaContatos){
            if (lista.nome == contato.nome){
                encontrou = lista.nome
                break
            }

        }
        return encontrou

    }
    fun imprimirTelefoneContatoPesquisa(contato: ClasseAgenda): String{
        var encontrou : String = ""

        for (lista in listaContatos){
            if (lista.nome == contato.nome){
                encontrou = lista.nome
                break
            }

        }
        return encontrou

    }

}