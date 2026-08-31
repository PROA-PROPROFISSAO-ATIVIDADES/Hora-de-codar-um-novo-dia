package Controller

import Model.getSize
import Model.toList
import Model.toSave
import Repository.Student
import View.askToContinue
import View.showState
import View.showStudents
import View.submit

fun addStudent(studentData: Triple<String, Int, String>){
    val student = Student(studentData.first, studentData.second, studentData.third)

    toSave(student)
    showState("Aluno ${student.name} cadastrado com sucesso")
}

fun addStudentAmount(){
    while(true){
        addStudent(submit())

        if(askToContinue()){
            showStudents(toList(), getSize())
            break
        }
    }
}

fun toList(){
    showStudents(toList(), getSize())
}