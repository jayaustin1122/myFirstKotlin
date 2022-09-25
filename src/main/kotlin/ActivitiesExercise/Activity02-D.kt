import kotlin.system.exitProcess
fun main(){
    //calling main menu
   var studentMD1P = StudentOfmd1p()
    studentMD1P.mainMenu()
}
//Primary Class
 class StudentOfmd1p(){
     var nameOfStudents = mutableListOf<String>("Joe","John","Matthew","Chris")
     var age  = mutableListOf<Int>(22,23,24,25)
     var finaGrade = mutableListOf<Double>(98.0,87.0,77.0,88.0)
    //Add Student Function.
     fun addStudent(){
         println("----Add Student----")
         print("Student Name: ")
         var newStudentMd1p :String = readln()
         this.nameOfStudents.add(newStudentMd1p)
         newStudentMd1p.uppercase()
         print("Student Age: ")
         var newStudentAge :Int = readln().toInt()
         this.age.add(newStudentAge)
         println("Success! $newStudentMd1p is added.")
         computeGrades()
         mainMenu()

     }
    //compute grades of added student
     fun computeGrades():Double{
         var finalGrade :Double = 0.0
         println("----Add Student Grade----")
         print("1st Sem Grade: ")
         var firstSem = readln().toDouble()
         print("2nd Sem Grade: ")
         var secondSem = readln().toDouble()
         finalGrade = (firstSem + secondSem)/2
         finaGrade.add(finalGrade)
         println("Your Final Grade is $finalGrade\nYour Grade has been recorded!")
         studentStatus()
         return finalGrade
         mainMenu()

     }
     //Function List of Students.
     fun studentListofMd1p(){
         println("----Student Lists----")
         var counter = 1
         var counter2 = 0
         for (i in nameOfStudents) {
             println("${counter}: $i")
             counter ++
         }
         println("-------------------------------")
         mainMenu()
     }
     //Function Student Status.
     fun studentStatus () {
         println("----Check Student Status----")
         var ctr1 :Int = 1
         var ctr2 :Int = 0
         for (i in nameOfStudents){
             println("Student ID No:${ctr1}\n"+
                     "Name:$i\n"+
                      "Age: ${age[ctr2]}\n"+
                      "Final Grade:${finaGrade[ctr2]}")
             println("-----------------------------------------------")
             ctr1++
             ctr2++
         }
         mainMenu()
     }
     fun mainMenu(){
         while (true) {
             print("[1]:List of Students\n[2]:Add Students\n[3]:Check Student Status\n[4]:Delete Student\n[5]:Exit\nSelect: ")
             var add = readln().toInt()
             if (add > 5 || add < 1) {
                 println("Invalid input!/ Out of Bounds Please Try Again.")
             } else if (add == 1) {
                 studentListofMd1p()
             } else if (add == 2) {
                 addStudent()
                 computeGrades()
             } else if (add == 3) {
                 studentStatus()
             } else if (add == 4){
                 deleteStudent()
             } else if (add == 5) {
                 println("Exit Code..")
                 exitProcess(1)
             }else {
                 println("Invalid Input!!")
                 break
             }
         }
     }
    fun deleteStudent(){
        println("---delete Student---")
        print("Enter ID Num: ")
        var input = readln().toInt()
        if (input == 1){
            nameOfStudents.remove(nameOfStudents[0])
            age.remove(age[0])
            finaGrade.remove(finaGrade[0])
        }else if (input == 2){
            nameOfStudents.remove(nameOfStudents[1])
            age.remove(age[1])
            finaGrade.remove(finaGrade[1])
        }else if (input == 3){
            nameOfStudents.remove(nameOfStudents[2])
            age.remove(age[2])
            finaGrade.remove(finaGrade[2])
        }else if (input == 4){
            nameOfStudents.remove(nameOfStudents[3])
            age.remove(age[3])
            finaGrade.remove(finaGrade[3])
        }else if (input == 5){
            nameOfStudents.remove(nameOfStudents[4])
            age.remove(age[4])
            finaGrade.remove(finaGrade[4])
        }else if (input == 5){
            nameOfStudents.remove(nameOfStudents[4])
            age.remove(age[4])
            finaGrade.remove(finaGrade[4])
        }else if (input == 6){
            nameOfStudents.remove(nameOfStudents[5])
            age.remove(age[5])
            finaGrade.remove(finaGrade[5])
        }
        mainMenu()
    }
 }