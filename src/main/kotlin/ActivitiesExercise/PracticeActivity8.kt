package ActivitiesExercise
fun main(){
    //calling the function
    println(maxNumber(1,10,3))

}
//Function for finding max number
fun maxNumber(num1:Int,num2:Int,num3:Int):Int {
    var result = 0
    //Checking the numbers who are the bigger value.
    if (num1 > num2 && num1 > num3) {
        result = num1
    }else if (num2 > num1 && num2 > num3){
        result = num2
    }else if (num3 > num1 && num3>num2) {
        result = num3
    }
    return result
}