package com.practice

class Student{
    var nameOfStudents = mutableListOf<String>("Joe","John","Matthew","Chris")
    var age  = mutableListOf<Int>(22,23,24,25)
    var finaGrade = mutableListOf<Double>(98.0,87.0,77.0,88.0)

    fun studentListofMd1p() {
        println("---Student Lists---")
        var counter = 1
        var counter2 = 0
        for (i in nameOfStudents) {
            println("${counter}: $i")
            counter++
        }
        println("-------------------------------")
    }
    fun addStudentDetails(student: String, age:Int){
        this.nameOfStudents.add(student)
        this.age.add(age)
        println("Success! ${student.capitalize()} is added.")
    }
    //compute grades of added student
    fun computeGrades(finalGrade:Double) {
        finaGrade.add(finalGrade)
        println("Success! New Student Details is added.")
    }
    //Function Student Status.
    fun studentStatus () {
        println("---Check Student Status---")
        var ctr1: Int = 1
        var ctr2: Int = 0
        for (i in nameOfStudents) {
            println(
                "Student ID No:${ctr1}\n" +
                        "Name:${i.capitalize()}\n" +
                        "Age: ${age[ctr2]}\n" +
                        "Final Grade:${finaGrade[ctr2]}"
            )
            println("-----------------------------------------------")
            ctr1++
            ctr2++
        }
    }
    fun deleteStudent(delete:Int){
        nameOfStudents.remove(nameOfStudents[delete])
        age.remove(age[delete])
        finaGrade.remove(finaGrade[delete])
        println("Success ${nameOfStudents[delete]} is Deleted.")
    }



}