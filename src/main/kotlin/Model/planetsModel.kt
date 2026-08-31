package Model

var planets = arrayListOf<String>("Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno", "Plutão")

fun fetchPlanets(): ArrayList<String> { //get já existe por baixo dos panos (bizarro)
    return planets
}

fun toFindPlanets(input: String): String? {
    return planets.find { it.equals(input, ignoreCase = true) }
    //return planets.filter { it.contains(input, ignoreCase = true ) }
}

fun getSizePlanets(): Int{
    return planets.size
}