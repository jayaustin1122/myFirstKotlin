fun main(){

//    try{
//        var num = arrayListOf<Int>(1,2,3)
//        println("Enter num")
//        var input = readln().toInt()
//        //calling index for out of bounds
//        println(num[4])
//    }catch(e:Exception){
//        println("Invalid Input")
//        println(e.message)
//    }catch (e:ArithmeticException){
//        println(e)
//        println("Division by 0 is not allowed!")
//    }catch (e:IndexOutOfBoundsException){
//        println(e)
//        println("Out of bounds!")
//    }catch (e:NumberFormatException){
//        println(e)
//        println("Division by 0 is not allowed!")
//    }
    try{
        var num1 = 30
        var num2 = 1
        var output = num1/num2
        println("Result: $output")
    }
    catch(e:ArithmeticException){
        println("You Shouldn't divide a number by zero")
    }
}