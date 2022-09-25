fun main (){
    while (true) {
            var newVar = Discount()
            //Input User.
            print("Enter Product: ")
            var product: String = readln()
            if (product == "" ) {
                println("Invalid Input Please use a valid Name of a product.")
                break }
            try {
                print("Enter Price: ")
                var price: Double = readln().toDouble()
                var str = String.format("%,.2f",price)
                println("Price of $product is $str")
                newVar.discountPrice(price)
                if (price < 0) {
                    println("Invalid Input! ${price} Use positive numbers only.")
                    break }
            //Checking exception to the input.
            } catch (e: Exception) {
                println("Invalid Input! or Use Integers Only")
                println(e.message)
            }
        print("Enter Again?[Y/N]: ")
        var ask = readln().uppercase()
        if (ask == "Y") {
        } else if (ask == "N") {
            break
        }else println("Invalid Input!")
    }
}
class Discount{
    var result:Double = 0.00
    var discount:Double = 0.00
    var percent = ""
    fun discountPrice(price: Double):Double{
        //Checking Condition.
        if ((price > 0 && price <= 10000)) {
            discount= price * 0.0
            result = price - discount
            percent = "0%"
        } else if ((price > 10000 && price <= 20000)) {
            discount = price * .05
            result = price - discount
            percent = "0.05%"
        } else if ((price > 20000 && price <= 50000)) {
            discount = price * 0.10
            result = price - discount
            percent = "10%"
        } else if ((price > 50000 && price <= 100000)) {
            discount = price * 0.15
            result = price - discount
            percent = "15%"
        } else if (price > 100000) {
            discount = price * 0.20
            result = price - discount
            percent = "20%"
        } else {println("Invalid Input Please Try Again")
        }
        var newDiscountFormat = String.format("%.2f",discount)
        println("Discount price is $newDiscountFormat ->$percent Discount Rate.")
        println("Net Price is : $result")
        return result
    }
}