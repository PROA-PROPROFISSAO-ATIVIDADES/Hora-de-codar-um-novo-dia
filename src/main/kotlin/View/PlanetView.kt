package View

import Controller.searchPlanet
import Controller.toListPlanets
import Utils.cleanConsole

fun menuPlanets(){
    var choice: Int

    while (true) {
        toListPlanets()
        println("Digite um numero de 1 a 2: ")
        println("""
            1. Pesquisar por um planeta
            2. Sair
        """.trimIndent())
        choice = readln().toIntOrNull() ?: -1;

        when(choice){
            1 -> searchPlanet()
            2 -> exit()
            else -> error()
        }
    }
}

fun showSearchResult(result: String){
    cleanConsole()
    println(result)
}

fun showAllPlanets(list: List<String>, size: Int){
    println("Total de $size planetas cadastrados")
    println("Listando todos os planetas: ")
    println(list)
}

fun searchInput(): String {
    println("Digite o nome de um planeta")
    return readln()
}