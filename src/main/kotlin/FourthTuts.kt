fun main() {
    //Enter the User
    print("Enter Your Grade: ")
    var grade: Int = readln().toInt()


    //Checking passed or fail.
    if ((grade >= 96) && (grade <= 100)) {
        println("1.00")
    } else if ((grade >= 86) && (grade <= 95)) {
        println("1.75")
    } else if ((grade >= 76) && (grade <= 85)) {
        println("2.25")
    } else if (grade < 75) {
        println("You Failed")
    } else {
        println("INVALID GRADE")
    }
    // enter user sex
    print("Enter Your Sex[M][F]: ")
    var gender: String = readln().toString()
    if ((gender == "M") || (gender == "m")) {
        println("Male")
    } else if ((gender == "F") || (gender == "f")) {
        println("Female")
    }else print("Invalid Enter")


}
