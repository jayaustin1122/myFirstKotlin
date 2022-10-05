package com.exercises

fun main(){
//Implement Activity 02 - C using Classes.
    var groceryStore = Grocery("",0.0,0)
    print("\t----CARDO'S GROCERY STORE 2.0----\n")
    while (true) {
        print("[1]:Add Item\n" +
              "[2]:Go to inventory\n" +
              "[3]:Exit\n" +
              "Select: ")
        var select1 = readln()
        // Check input and compare to conditions
        if (select1.length > 1) {       //select .length control input
            println("Invalid Input!/ Just Choose 1-3")
            continue
        } else if (select1.toInt() == 1) {
                println("---Add Item---")
                print("Product Name: ")
                var name = readln().capitalize()
                groceryStore.product1.add(name)
                print("Product Price: ")
                var price = readln().toDouble()
                groceryStore.price1.add(price)
                print("Product Quantity: ")
                var quantities = readln().toInt()
                groceryStore.quantity1.add(quantities)
                println("SUCCESS ITEM IS ADDED!")


            // inventory
        }else if (select1.toInt() == 2) {
            groceryStore.inventory1()
            // Exit program
        }else if (select1.toInt() == 3) {
            println("Exiting")
            break
        }else{
            println("Invalid Input!")
        }
        // Ask the user to go to com.tutorials.main menu or not.
        print("\nGo to Main Menu?Y/N: ")
        var select3 = readln().toString()
        if (select3 == "Y" || select3 == "y")
            continue
        else if (select3 == "N" || select3 == "n"){
            println("Exiting")
            break
        }else print("Invalid Input")
        break
    }
    println("Thank you!")
}
class Grocery(var product :String, var price:Double,var quantity:Int){
    constructor(quantity: Int,price: Double)   :this("Shampoo",price,quantity)
    constructor(quantity: Int)                 :this("Soap",25.0,quantity)
    constructor(price: Double)                 :this("Detergent",price,12)
    constructor(product: String)               :this(product,107.0,24)
    constructor(product: String,price: Double) :this(product,price,100)
    constructor(product: String,quantity: Int) :this(product,24.0,quantity)
    constructor(price: Double,product: String) :this(product,price,12)
    constructor(price: Double,quantity: Int)   :this("Apples",price,quantity)
    constructor(quantity: Int,product: String) :this(product,120.0,quantity)
    var product1 = arrayListOf<String>()
    var price1 = arrayListOf<Double>()
    var quantity1 = arrayListOf<Int>()
    fun inventory1(){
        var shampoo = Grocery(12,24.0)
        var soap = Grocery(12)
        var detergent = Grocery(7.0)
        var pencil = Grocery("Pencil")
        var bondPaper = Grocery("Bond Paper",150.00)
        var envelope = Grocery("Envelope",50)
        var orange = Grocery(12.0,"Orange")
        var apples = Grocery(10.0,12)
        var grapes = Grocery(1,"Grapes")
        println("Product    |    Price    |  Quantity")
        print("${shampoo.product} :")
        print("\t\t${shampoo.price}  ")
        print("\t\t${shampoo.quantity}\n")

        print("${soap.product} :")
        print("\t\t\t${soap.price}  ")
        print("\t\t${soap.quantity}\n")

        print("${detergent.product} :")
        print("\t\t${detergent.price}  ")
        print("\t\t${detergent.quantity}\n")

        print("${pencil.product} :")
        print("\t\t${pencil.price}  ")
        print("\t\t${pencil.quantity}\n")

        print("${bondPaper.product} :")
        print("\t${bondPaper.price}  ")
        print("\t\t${bondPaper.quantity}\n")

        print("${envelope.product} :")
        print("\t\t${envelope.price}  ")
        print("\t\t${envelope.quantity}\n")

        print("${orange.product} :")
        print("\t\t${orange.price}  ")
        print("\t\t${orange.quantity}\n")

        print("${apples.product} :")
        print("\t\t${apples.price}  ")
        print("\t\t${apples.quantity}\n")

        print("${grapes.product} :")
        print("\t\t${grapes.price}  ")
        print("\t\t${grapes.quantity}\n")
        for (i in product1)
            print("${i[0]} :")
        for (j in price1)
            print("\t\t${j}  ")
        for (k in quantity1)
            print("\t\t${k}")
    }

}

