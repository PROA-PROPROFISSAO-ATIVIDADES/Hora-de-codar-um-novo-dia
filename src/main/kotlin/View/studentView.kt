package View

import Controller.addStudent
import Controller.addStudentAmount
import Controller.toList
import Repository.Student
import kotlin.system.exitProcess

fun menuStudentSignUp(){
    var choice: Int

    while (true){
        println("Digite um numero de 1 a 4: ")

        println("""
            1. Adicionar aluno
            2. Adicionar Alunos em massa
            3. Listar Alunos
            4. Sair
        """.trimIndent())
        choice = readln().toIntOrNull() ?: -1;

        when(choice){
            1 -> addStudent(submit())
            2 -> addStudentAmount()
            3 -> toList()
            4 -> exit()
            else -> error()
        }
    }
}

fun submit(): Triple<String, Int, String>{
    println("Digite o nome do aluno: ")
    val name = readln()

    println("Digite a idade do aluno: ")
    val age = readln().toInt()

    println("Digite uma descrição para o aluno ou aperte Enter: (Opicional)")
    val description = readln()

    return Triple(name, age, description)
}

fun askToContinue(): Boolean {
    println("Digite PARE para encerrar ou qualquer coisa para continuar: ")
    return readln().uppercase() != "PARE"
}

fun showState(state: String){
    println(state)
}

fun showStudents(list: List<Student>, total: Int){
    println("Total de $total alunos cadastrados")
    println("Listando todos os alunos: ")
    list.forEach { println(it) }
}

fun exit(){
    exitProcess(0)
}

fun error(){
    println("Ocorreu algum erro!")
}

