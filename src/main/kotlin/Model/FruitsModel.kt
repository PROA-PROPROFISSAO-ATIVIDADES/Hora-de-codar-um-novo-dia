package Model

import Repository.Fruit

val fruitNames = arrayListOf("Maça", "Pera", "Goiaba", "Banana", "Melancia", "Morango", "Caju")

fun transformFruits(): ArrayList<Fruit> {
    var list = arrayListOf<Fruit>()
    for(fruit in fruitNames){
        list.add(Fruit(fruit, (0..1).random()))
    }
    return list
}

var fruits = transformFruits();
var boughtFruits = arrayListOf<Fruit?>()

fun fetchFruits(): ArrayList<Fruit> {
    return fruits
}

fun findFruits(input: String): Fruit? {
    return fruits.find { it.name.equals(input, ignoreCase = true)}
}

fun deleteFruit(input: String): Pair<Boolean, Fruit?>{
    val fruit = findFruits(input)
    if(fruit != null){
        boughtFruits.add(fruit)
        if(fruit.quantity > 1){ fruit.quantity-- } else { fruits.remove(fruit) }
        return Pair(true, fruit)
    }

    return Pair(false, null)
}

fun fetchSizeFruit(): Int{
    return fruits.sumOf { it.quantity }
}

fun fectchBoughtFruits(): ArrayList<Fruit?>{
    return boughtFruits
}