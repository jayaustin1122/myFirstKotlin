fun main (){

    print ("Enter Product: ")
    var product : String = readln().toString()
    print ("Enter Price: ")
    var price : Double = readln().toDouble()
    if ((price >= 0) && (price <=10000)) {
        var discount = ("Price of "+price * .0).toInt()
        println("Discount is " + discount)
        var sum: Double =  price - discount.toDouble()
        var result : Double  = price - discount.toDouble()
        println("Net Price is : " + result)
    }else if((price >= 10000) && (price <=20000)) {
        println("Price of "+product + " is " + price)
        var discount = (price * .05).toInt()
        println("Discount is " + discount)
        var sum: Double =  price - discount.toDouble()
        var result : Double  = price - discount.toDouble()
        println("Net Price is : " + result)
    }else if((price >=20000) && (price <=50000)) {
        println("Price of "+product + " is " + price)
        var discount = (price * 0.10).toInt()
        println("Discount is " + discount)
        var sum: Double =  price - discount.toDouble()
        var result : Double  = price - discount.toDouble()
        println("Net Price is : " + result)
    }else if((price >=50000) && (price <=100000)) {
        println("Price of "+product + " is " + price)
        var discount = (price * 0.15).toInt()
        println("Discount is " + discount)
        var sum: Double =  price - discount.toDouble()
        var result : Double  = price - discount.toDouble()
        println("Net Price is : " + result)
    }else if(price > 100000) {
        println("Price of "+product + " is " + price)
        var discount = (price * 0.20).toInt()
        println("Discount is " + discount)
        var sum: Double =  price - discount.toDouble()
        var result : Double  = price - discount.toDouble()
        println("Net Price is : " + result)
    }else
        print("Invalid!")

}