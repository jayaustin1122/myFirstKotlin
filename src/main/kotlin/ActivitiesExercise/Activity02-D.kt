fun main(){
    var students = Student1()
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
class Student1{
    var nameOfStudents = mutableListOf<String>("Joe","John","Matthew","Chris")
    var age  = mutableListOf<Int>(22,23,24,25)
    var finaGrade = mutableListOf<Double>(98.0,87.0,77.0,88.0)
    //Print list of Students only
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
    //Add Student and Details
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
    //Delete student
    fun deleteStudent(delete:Int){
        nameOfStudents.remove(nameOfStudents[delete])
        age.remove(age[delete])
        finaGrade.remove(finaGrade[delete])
        println("Success ${nameOfStudents[delete]} is Deleted.")
    }
}