fun main(){
    /*Functions build-in
    -println()
    -toInt()
    -readln()
    -main()
     */

    diplayName()
    displayMessage("Hello")
}
//---------------------------------------------------
//Making our function
//empty parameter /no return
                   //unit is return type  means no return types function. optional it works when blank.
fun diplayName():Unit{
    println("Peter")
}
//---------------------------------------------------
//another function with 1 parameters/ no return
fun displayMessage(msg:String){
    println("The message is $msg")
}