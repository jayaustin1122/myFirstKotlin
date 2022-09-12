//Global Variable
var students = arrayListOf<String>("Coco","Martin","Cardo","Dalisay")
var grades = arrayListOf<Int>(99,76,75,88)
fun main(){
    //Main menu
    println("-----------MD1P Course-----------")
    while (true) {
        //Checking input while checking the conditions.
        print("[1]:List of Students\n[2]:Add Students\n[3]:Check Student Status\nSelect: ")
        var add = readln().toInt()
        if (add > 3 || add <1) {
            println("Invalid input!/ Out of Bounds Please Try Again.")
            break
        }else if (add == 1){
            studentList()
        }else if (add == 2) {
            addStudent()
        }else if (add == 3) {
            studentList()
            studentStatus()
        }
        print("Go to Main Menu?Yes/No: ")
        var menu = readln().capitalize()
        if (menu == "Yes"){
            continue
        }else if (menu == "No") {
            break
        }else{ println("Invalid Input!!")
            break
        }
    }
    println("Thank You!")
}
//Function that add Student
fun addStudent(){
    println("----Add Student----")
    print("Student Name: ")
    var newStudent = readln()
    students.add(newStudent)
    newStudent.uppercase()
    println("Success! $newStudent is added.")
    studentList()


}
//Function List of Students.
fun studentList(){
    println("----Student Lists----")
    var counter = 0
    for (i in students) {
        counter += 1
        println("${counter.toString()}: $i")
    }
}
//Function Student Status.
fun studentStatus () {
    println("----Check Student Status----")
    print("Select Student: ")
    var select = readln().toInt()
    if (select == 1) {
        println("You Select ${students[0]}")
        println("Final Grade is ${grades[0]}")
    }else if (select == 2){
        println("You Select ${students[1]}")
        println("Final Grade is ${grades[1]}")
    }else if (select == 3){
        println("You Select ${students[2]}")
        println("Final Grade is ${grades[2]}")
    }else if (select == 4){
        println("You Select ${students[3]}")
        println("Final Grade is ${grades[3]}")
    }else if (select == 5){
        println("You Select ${students[4]}")
        println("Not yet Graded.")
    }else println("Invalid Input!")
}
