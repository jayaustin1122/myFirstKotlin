package com.practice

import kotlin.system.exitProcess

fun main(){
    var students = Student()
    while (true) {
        print("[1]:List of Students\n[2]:Add Students\n[3]:Check Student Status\n[4]:Delete Student\n[5]:Exit\nSelect: ")
        var add = readln().toInt()
        if (add > 5 || add < 1) {
            println("Invalid input!/ Out of Bounds Please Try Again.")
        } else if (add == 1) {
            students.studentListofMd1p()
        } else if (add == 2) {
            println("---Add Student---")
            print("Student Name: ")
            var newStudentMd1p :String = readln()
            newStudentMd1p.capitalize()
            print("Student Age: ")
            var newStudentAge :Int = readln().toInt()
            var finalGrade: Double = 0.0
            println("Add Grade")
            print("1st Sem Grade: ")
            var firstSem = readln().toDouble()
            print("2nd Sem Grade: ")
            var secondSem = readln().toDouble()
            finalGrade = (firstSem + secondSem) / 2
            students.addStudentDetails(newStudentMd1p,newStudentAge)
            students.computeGrades(finalGrade)
        } else if (add == 3) {
            students.studentStatus()
        } else if (add == 4){
            println("---DELETE STUDENT---")
            students.studentListofMd1p()
            print("Enter ID Num: ")
            var input = readln().toInt()
            students.deleteStudent(input-1)
        } else if (add == 5) {
            println("Exit Code..")
            break
        }
        print("Go to Main Menu?Y/N: ")
        var select3 = readln()
        if (select3 == "Y" || select3 == "y")
            continue
        else if (select3 == "N" || select3 == "n"){
            println("Exiting")
            break
        }else print("Invalid Input")
        break
    }
}