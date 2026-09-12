package View

import Controller.addStudent
import Controller.addStudentAmount
import Controller.toList
import Repository.Student
import Utils.error
import Utils.exit

fun start(){
    addStudentAmount()
}

fun submitWithName(name: String): Triple<String, Int, String>{
    var age: Int? = null
    while(age == null){
        println("Digite a idade do aluno: ")
        val input = readln()
        age = input.toIntOrNull()
        if(age == null){
            println("Idade inválida. Digite apenas números.")
        }
    }

    println("Digite uma descrição para o aluno ou aperte Enter: (Opicional)")
    val description = readln()

    return Triple(name, age, description)
}

fun showState(state: String){
    println(state)
}

fun showStudents(list: List<Student>, total: Int){
    println("Total de $total alunos cadastrados")
    println("Listando todos os alunos: ")
    list.forEach { println(it) }
}

