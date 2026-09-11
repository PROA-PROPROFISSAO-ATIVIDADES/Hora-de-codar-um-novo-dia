package View

import Controller.finishGrocery
import Controller.toBuy
import Controller.toListFruits
import Repository.Fruit
import Utils.cleanConsole
import Utils.error
import Utils.exit


fun menuFruit(){
    var choice: Any

    while (true){
        println("------------------------------")
        println("Frutas disponiveis do mercado:")
        println(toListFruits())
        println("------------------------------")

        println("Digite um numero de 1 a 2")
        println("""
            1. Comprar
            2. Desistir
        """.trimIndent())
        println("------------------------------")
        println("Digite 'PARE' para finalizar as compras")

        choice = readln()
        when {
            choice.toIntOrNull() == 1-> toBuy()
            choice.toIntOrNull() == 2-> exit()
            choice.equals("PARE", ignoreCase = true) -> finishGrocery()
            else -> error()
        }
    }
}

fun askNameFruit(): String{
    repeat(5) { println()}
    println("------------------------------")
    println("Digite 'PARE' para finalizar as compras")
    println("------------------------------")

    println("Frutas disponiveis do mercado:")
    println(toListFruits())
    println("Digite o nome de uma fruta: ")
    val fruitName = readln()

    if(fruitName.uppercase() == "PARE") finishGrocery()

    return fruitName
}

fun showAllBoughtFruits(list: ArrayList<Fruit?>){
    cleanConsole()
    println("------------------------------")
    println("Frutas compradas: ")
    for(fruit in list){
        println(fruit)
    }
    println("------------------------------")
    println()

    println("Frutas ainda disponiveis no mercado: ")
    println(toListFruits())
}
