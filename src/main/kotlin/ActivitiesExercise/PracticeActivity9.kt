fun main() {
    //Objects
    println("----CHOOSE---")
    while (true) {
        print("[1]:Add Item\n[2]:Check Phones\n[3]:Exit\nSelect: ")
        var check = readln().toInt()
        if (check > 3|| check < 1) {
            print("Invalid Out of range.")
        }else if (check == 1){
            print("Enter Cellphone Brand: ")
            var brand = readln().capitalize()
            print("Android Version: ")
            var androidV = readln().toDouble()
            print("Battery Capacity: ")
            var battery = readln().toInt()
            print("Manufacturer: ")
            var maidBy = readln().capitalize()
            print("Display Size: ")
            var dSize = readln().toDouble()
            //primary constructor
            var myCellphone = MobilePhone(brand, battery, maidBy, dSize, androidV)
            println(
                "Cellphone Brand: ${myCellphone.cpBrand}" +
                        "\nAndroid Version: ${myCellphone.androidVersion}" +
                        "\nBattery is     : ${myCellphone.battery}Mah" +
                        "\nManufacturer   : ${myCellphone.manufacturer}" +
                        "\nDisplay Size   : ${myCellphone.displaySize} Inches.")
            myCellphone.goodDisplay()
        }else if (check == 2){
            //secondary constructor
            var vivoY1s = MobilePhone()
            println(
                "Cellphone Brand: ${vivoY1s.cpBrand}" +
                        "\nAndroid Version: ${vivoY1s.androidVersion}" +
                        "\nBattery is     : ${vivoY1s.battery}Mah" +
                        "\nManufacturer   : ${vivoY1s.manufacturer}" +
                        "\nDisplay Size   : ${vivoY1s.displaySize} Inches.")
            vivoY1s.performance()
            vivoY1s.longLastingBattery()
            vivoY1s.goodCamera()

            //calling another constructor
            var newPhone = MobilePhone("Lenovo", 3000, 5.0,)
            println(
                "Cellphone Brand: ${newPhone.cpBrand}" +
                        "\nAndroid Version: ${newPhone.androidVersion}" +
                        "\nBattery is     : ${newPhone.battery}Mah" +
                        "\nManufacturer   : ${newPhone.manufacturer}" +
                        "\nDisplay Size   : ${newPhone.displaySize} Inches.")
            newPhone.storage()
        }else if (check == 3){
            println("Exiting Program...")
            break
        }else {
            println("Invalid Input!")
        }
        println("Thank You.")

    }
}//Attributes

class MobilePhone(var cpBrand:String,
                  var battery:Int,
                  var manufacturer:String,
                  var displaySize:Double,
                  var androidVersion:Double) {
    init {
        println("*********************************")
    }
    //all parameters are not given.
    constructor(cpBrand: String,battery: Int,displaySize: Double):this(cpBrand, battery, "Not Identified", displaySize, 10.0)
    //all parameters are given.
    constructor():this("Vivo Y1s", 5500, "Vivo Comp.", 6.22, 10.0)

    init {
        println("PHONES:")
    }

    //Behaviors
    fun performance() {
        println("Have the best processor.")
    }
    fun longLastingBattery() {
        println("Have the long lasting Battery")
    }
    fun goodDisplay() {
        println("Have a Good Display")
    }
    fun goodCamera() {
        println("Have the Good Camera")
    }
    fun storage() {
        println("Have the best Storage.")
    }
}