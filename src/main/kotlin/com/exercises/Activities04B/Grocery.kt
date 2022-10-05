package com.exercises.Activities04B
class Grocery:Info,Message(){
    var product1 = arrayListOf<String>("Shampoo","Soap","ToothPaste")
    var product2 = arrayListOf<String>("Pencil","Ballpen","Bond-Papers")
    var product3 = arrayListOf<String>("Grapes","Orange","Apple")
    var price1 = arrayListOf<Double>(7.0,25.0,10.0)
    var price2 = arrayListOf<Double>(7.0,15.0,100.0)
    var price3 = arrayListOf<Double>(120.00,45.0,50.0)
    var quantity1 = arrayListOf<Int>(1,1,1)
    var quantity2 = arrayListOf<Int>(10,10,100)
    var quantity3 = arrayListOf<Int>(1,1,1)

    fun addItem1(product:String,price:Double,qty:Int){
        product1.add(product)
        price1.add(price)
        quantity1.add(qty)
    }
    fun addItem2(product:String,price:Double,qty:Int){
        product2.add(product)
        price2.add(price)
        quantity2.add(qty)
    }
    fun addItem3(product:String,price:Double,qty:Int){
        product3.add(product)
        price3.add(price)
        quantity3.add(qty)
    }
    fun listOfItems(){
        var counter = 0
        println("---HEALTH AND BEAUTY DEPARTMENT---")
        for (i in product1){
            println("Product: $i\nPrice: ${price1[counter]}\nQuantity: ${quantity1[counter]}")
            counter++
        }
        println("--------------------------------")
        var counter1 = 0
        println("---SCHOOL SUPPLIES DEPARTMENT---")
        for (i in product2){
            println("Product: $i\nPrice: ${price2[counter1]}\nQuantity: ${quantity2[counter1]}")
            counter++
        }
        println("--------------------------------")
        var counter2= 0
        println("---FRUITS AND VEGETABLES DEPARTMENT---")
        for (i in product3){
            println("Product: $i\nPrice: ${price3[counter2]}\nQuantity: ${quantity3[counter2]}")
            counter++
        }
        println("--------------------------------")
    }

    override fun message() {
        println("Thank You For Using Our App.")
    }
}
