package Controller

import Model.getSizePlanets
import Model.toFindPlanets
import View.searchInput
import View.showAllPlanets
import Model.fetchPlanets
import View.showSearchResult

fun toListPlanets(){
    showAllPlanets(fetchPlanets(), getSizePlanets())
}

fun searchPlanet(){
    val input = searchInput()
    val result = toFindPlanets(input)
    if(result == null) { showSearchResult("$input não foi encontrado no nosso banco de dados. Se atente ao uso dos acentos")}
    else { showSearchResult("$result está cadastrado no nosso sistema") }
}