fun main(){
    //println(total(2,4,5,5))// example function that have parameters.
    println(total2(1,2,3,4,5,6,7,8,9))//example for vararg
}

fun total(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    println("This is the total value")
    return num1+num2+num3+num4
}
//vararg unlimited to carry the input
fun total2(vararg numbers : Int):Int{
    var sumOfAllNumbers : Int = 0
    for (num in numbers) {
        sumOfAllNumbers = sumOfAllNumbers + num
    }
    return sumOfAllNumbers
}