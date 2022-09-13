fun main(){
    //using lambda
    var sum : (Int,Int) -> Int = {num1,num2 ->
        num1 + num2

    }
    println(sum)
}
//default
fun sum2(num1 : Int,num2:Int):Int{
    return  num1+num2
}