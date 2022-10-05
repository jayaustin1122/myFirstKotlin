package com.exercises.Activities04B

import com.exercises.Grocery

/*Activity 04 - B, Implement Activity 01 - C using OOP use all OOP concepts */
fun main() {
    var groceryStore = Grocery()
    print("\t----CARDO'S GROCERY STORE 2.0----\n")
    while (true) {
        print("[1]:Add Item\n" +
                "[2]:Go to inventory\n" +
                "[3]:Exit\n" +
                "Select: ")
        try {
            var select1 = readln()
            // Check input and compare to conditions
            if (select1.length > 1) {       //select .length control input
                throw Exception()
            } else if (select1.toInt() == 1) {
                println("---ADD ITEM---")
                println("[1]:Health & Beauty\n[2]:School Supplies\n[3]:Fruits & Vegetables")
                print("Select Department: ")
                var input = readln().toInt()
                if (input == 1) {
                    println("---HEALTH AND BEAUTY DEPARTMENT---")
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
                    continue
                } else if (input == 2) {
                    println("---SCHOOL SUPPLIES DEPARTMENT---")
                    print("Product Name: ")
                    var name = readln().capitalize()
                    groceryStore.product2.add(name)
                    print("Product Price: ")
                    var price = readln().toDouble()
                    groceryStore.price2.add(price)
                    print("Product Quantity: ")
                    var quantities = readln().toInt()
                    groceryStore.quantity2.add(quantities)
                    println("SUCCESS ITEM IS ADDED!")
                    continue
                } else if (input == 3) {
                    print("Product Name: ")
                    var name = readln().capitalize()
                    groceryStore.product3.add(name)
                    print("Product Price: ")
                    var price = readln().toDouble()
                    groceryStore.price3.add(price)
                    print("Product Quantity: ")
                    var quantities = readln().toInt()
                    groceryStore.quantity3.add(quantities)
                    println("SUCCESS ITEM IS ADDED!")
                    continue
                } else println("Invalid Input!")
                break
                // inventory
            } else if (select1.toInt() == 2) {
                groceryStore.listOfItems()
                // Exit program
            } else if (select1.toInt() == 3) {
                println("Exiting")
                break
            } else {
                println("Invalid Input!")
            }
            groceryStore.message()
            groceryStore.info()
        }catch (e:Exception){
            println("Invalid Input!")
        }catch (e:ArrayIndexOutOfBoundsException){
            println(e.message)
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

