fun main () {

    //Practice Activity 3
    // Enter the user's Age
    print("Enter Your Age: ")
    var age: Int = readln().toInt()
     //Checking..
    if ((age >= 1) && (age <= 17)) {
        println("Under Age")
    } else if ((age >= 18) && (age <= 30)) {
        println("Young Adult")
    } else if ((age >= 31) && (age <= 59)) {
        println("Adult")
    } else if (age >= 60) {
        println("Senior")
    } else print("Invalid age")
    //END
}