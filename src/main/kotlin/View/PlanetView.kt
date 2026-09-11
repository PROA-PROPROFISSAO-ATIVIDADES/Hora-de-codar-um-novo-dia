package View

import Controller.searchPlanet
import Controller.toListPlanets
import Utils.cleanConsole
import Utils.error
import Utils.exit

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
    repeat(3) { println()}
    println("Total de $size planetas cadastrados")
    println("------------------------------------------")
    println("Listando todos os planetas: ")
    println(list)
    println("------------------------------------------")
}

fun searchInput(): String {
    cleanConsole()
    println("-----------------------------")
    println("Digite o nome de um planeta: ")
    return readln()
}