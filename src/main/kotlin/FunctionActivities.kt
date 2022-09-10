fun main(){
    print("Enter String: ")
    var input = readln()
    paindromeChecker(input)
}
fun paindromeChecker(input: String){
    var new = input.reversed()
    if (new.uppercase() == input.uppercase()){
        println("$input is a Palindrome")
    }else
        println("$input is Not a palindrome")
}