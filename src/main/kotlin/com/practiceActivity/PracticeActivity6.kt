fun main(){
    //enter user
    print("Enter String: ")
    var input = readln()
    paindromeChecker(input)
}
//function to check by input of the user
fun paindromeChecker(input: String){
    var new = input.reversed()
    if (new.uppercase() == input.uppercase()){
        println("$input is a Palindrome")
    }else
        println("$input is Not a palindrome")
}