package Controller

import Model.getSize
import Model.fetchStudents
import Model.toSave
import Repository.Student
import Utils.exit
import View.showState
import View.showStudents
import View.submitWithName

fun addStudent(studentData: Triple<String, Int, String>){
    val student = Student(studentData.first, studentData.second, studentData.third)

    toSave(student)
    showState("Aluno ${student.name} cadastrado com sucesso")
}

fun addStudentAmount(){
    while(true){
        println("-----------------")
        println("Digite o nome do aluno (ou 'PARE' para encerrar os cadastros): ")
        val name = readln()

        if(name.equals("PARE", ignoreCase = true)){
            toList()
            exit()
        }

        addStudent(submitWithName(name))
    }
}

fun toList(){
    showStudents(fetchStudents(), getSize())
}