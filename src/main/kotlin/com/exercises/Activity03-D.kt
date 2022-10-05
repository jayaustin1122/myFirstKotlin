package com.exercises
/*Activity 03 - D Use Activity 02 - F identify scenarios when adding inventory and create junit tests for each*/
fun main(){
    var groceryStore = Grocery1()
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
            print("Product Price: ")
            var price = readln().toDouble()
            print("Product Quantity: ")
            var quantities = readln().toInt()
            groceryStore.addItem(name,price,quantities)
            // inventory
        }else if (select1.toInt() == 2) {
            groceryStore.inventory2()
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
class Grocery1(){

    var product2 = arrayListOf<String>()
    var price2 = arrayListOf<Double>()
    var quantity2 = arrayListOf<Int>()
    //functions inventory
    fun inventory2(){
        println("---Inventory---")
        var counter = 0
        for (i in product2){
            print("Item: $i\n" +
                  "Price: ${price2[counter]}\n" +
                  "Quantity:${quantity2[counter]}\n")
        }
    }
    //function to com.tutorials.add items
    fun addItem(name:String,price:Double,quantities:Int):String{
        product2.add(name)
        price2.add(price)
        quantity2.add(quantities)
        for (i in product2)
        println("->$i\nITEM IS ADDED!")
        println("--------------------------")
        return name
    }
}

