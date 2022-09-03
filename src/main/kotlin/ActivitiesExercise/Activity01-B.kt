fun main (){

    println("\t==Welcome To Our Library===")
    println("")
    println("\t\tBooks You Can Borrow: ")
    var book1 : String = "Algebra"
    var book2 : String = "Mathematics"
    var book3 : String = "Science"
    var book4 : String = "Comics"
    var book5 : String = "Newspaper"
    println("-"+book1)
    println("-"+book2)
    println("-"+book3)
    println("-"+book4)
    println("-"+book5)

    print("Please Enter to see Details: ")
    var enter : String = readln()
    println(book1.uppercase()+"\n -is a branch of mathematics dealing with symbols and the rules for manipulating those symbols")
    println(book2.uppercase()+"\n -is a textbook for students who have some acquaintance with the basic notions of variables and equations, negative numbers etc.")
    println(book3.uppercase()+"\n -for a wide audience presumed to have a general education rather than a specifically scientific training")
    println(book4.uppercase()+"\n -is also called comicbook, comic magazine or simply comic, is a publication that consists of comics art in the form of sequential")
    println(book5.uppercase()+"\n -for reading news.")
}