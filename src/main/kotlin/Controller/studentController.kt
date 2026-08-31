package Controller

import Model.getSize
import Model.fetchStudents
import Model.toSave
import Repository.Student
import Utils.askToContinue
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
            showStudents(fetchStudents(), getSize())
            break
        }
    }
}

fun toList(){
    showStudents(fetchStudents(), getSize())
}