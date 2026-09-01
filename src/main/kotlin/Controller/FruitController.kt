package Controller

import Model.deleteFruit
import Model.fectchBoughtFruits
import Model.fetchFruits
import Model.fetchSizeFruit
import Utils.askToContinue
import Utils.exit
import View.askNameFruit
import View.showAllBoughtFruits
import View.showState

fun toBuy(){
    while(true){
        if(fetchSizeFruit() <= 0) {
            showState("Lista de compras finalizada")
            break
        }
        println()

        val result = deleteFruit(askNameFruit())
        if(result.first) { showState("${result.second?.name} adicionada ao carrinho") }
        else { showState("Fruta indisponível no nosso mercado") }

        if(!askToContinue()) {
            finishGrocery()
            break
        }
    }
}

fun toListFruits(): List<String>{
    return fetchFruits()
        .filter { it.quantity >0 }
        .map { it.name }
}

fun finishGrocery(){
    showAllBoughtFruits(fectchBoughtFruits())
    exit()
}