package ActivitiesExercise
/*
Activity 04 - C
Implement add, subtract, divide, multiply, modulo, average, using overloading. */
fun main(){
    //object
    var compute = ComputeEquations()
    compute.compute(1.0,2.0)
    compute.compute(1,2.0)
    compute.compute(1.0,2)
    compute.compute(1,2)
    compute.compute(1.0,"2")
    compute.compute("98",89.0)
}
class ComputeEquations(){
    var add = 0.00
    var subtract = 0.00
    var divide = 0.00
    var multiply = 0
    var modulo = 0.0
    var average = 0.00
    //addition
    fun compute(num1:Double,num2:Double):Double{
        add = num1+num2
        println("Addition: $num1 + $num2 = $add")
        return add
    }
    //subtraction
    fun compute(num1:Int,num2:Double):Double{
        subtract = num1-num2
        println("Subtraction: $num1 - $num2 = $subtract")
        return subtract
    }
    //division
    fun compute(num1:Double,num2:Int):Double{
        divide = num1/num2
        println("Division: $num1 / $num2 = $divide")
        return divide
    }
    //multiplication
    fun compute(num1:Int,num2:Int):Int {
        multiply = num1 * num2
        println("Multiplication is: $num1 * $num2 = $multiply")
        return multiply
    }
    //Modulo
    fun compute(num1:Double,num2:String):Double{
        modulo = num1%num2.toInt()
        println("Modulo or Remainder is: $num1 % $num2 = $modulo")
        return modulo
    }
    //Average
    fun compute(num1:String,num2:Double):Double{
        average = (num1.toInt()+num2)/2
        println("Average is: $num1 + $num2 / 2 = $average")
        return average
    }
}
