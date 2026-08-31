package Model

import Repository.Student

var students = arrayListOf<Student>()

fun toSave(student: Student){
    students.add(student)
}

fun toList(): ArrayList<Student> {
    return students
}

fun getSize(): Int{
    return students.size
}