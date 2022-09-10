fun main() {
        //Create an application that will accept 1 string.
        // Your application will print “Palindrome” if the string is a palindrome.

        val original: String
        var reverse = "" // Objects of String class
        // enter user
        print("Enter a string/number to check if it is a palindrome\n ->>: " )
        var word = readln().toString()
        val length = word.length
        for (i in length - 1 downTo 0)
                // reversing the input of the user
                reverse = reverse + word[i]
                print(reverse)
        //comparing
        if (word == reverse)
                println("$word is a Palindrome.")
        else
                println("$word is not a palindrome.")
}
