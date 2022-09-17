fun main(){
    print("Choose our Phone or Your Phone\n[1]:Our Oppo phone\n" +
                                            "[2]:Your Phone\n" +
                                            "Select Phone:")
    var input = readln().toInt()
    if (input == 1){
        var phone = SmartPhone()
        phone.mainMenu()
    }else if (input == 2){
        print("Enter Cellphone Brand: ")
        var brand = readln()
        print("Current Battery Charge: ")
        var charge = readln().toInt()
        print("Current Load: ")
        var load = readln().toDouble()
        var urPhone = SmartPhone(load,charge,brand)
        urPhone.mainMenu()
    }

}
class SmartPhone(var load : Double , var batteryPercentage : Int,var brand : String ) {

    init {
        println("---------------------------")
        println("Object Created!")
        println("---------------------------")
    }
    constructor():this(20.0,50,"Oppo")
    fun buyLoad() {
        println("---Buy Load---")
        print("Enter amount: ")
        var amount: Double = readln().toDouble()
        if (amount < 0) {
            println("Invalid Amount!")
        } else {
            this.load = this.load + amount
            println("Success $amount is successfully added.")
            println("Balance ${this.load}")

        }
    }
    fun chargeBattery() {
        println("---Charge Phone---")
        print("Enter desired Percent: ")
        var percent: Int = readln().toInt()
        if (percent < 0 || percent > 100) {
            println("Invalid!")
        } else {
            this.batteryPercentage = this.batteryPercentage + percent
            println("Success $percent% is successfully added.")
            println("Battery Percent ${this.batteryPercentage}%")
        }
    }

    fun sendText() {
        println("---Send Text Message---")
        print("Enter Message: ")
        var input = readln()
        if (input.length > 50) {
            this.load = this.load - 5

        } else if (input.length < 1) {
            this.load = this.load - 2
        }
        println("Balance: ${this.load}")
    }

    fun checkStatus() {
        println("---STATUS---")
        println(this.brand)
        println("Your Load Balance is ${this.load}")
        println("Your Battery Percent is ${this.batteryPercentage}%")
        }

    fun callminutes() {
        println("---Call---")
        println("8 load per 1 Minute Call")
        print("Enter minute/minute's: ")
        var input = readln().toInt()
        if (load < 8.0) {
            println("WARNING\nInsufficient Balance!Please Re load. ")
        } else if (input == 1){
            this.load = this.load - 8

        }else if (input == 2) {
            this.load = this.load - 16
        }else if (input == 3) {
            this.load = this.load - 24
        }else if (input == 4) {
            this.load = this.load - 32
        }else {
            println("Invalid Input!")
        }
        println("Balance: ${this.load}")
    }
    fun select(){
        println("[1]:Our Vivo phone\n[2]:Your Phone\nSelect Phone:")

    }
    fun mainMenu(){
        while (true) {
            print(
                "Choose Process\n" +
                        "[1]:Buy Load\n" +
                        "[2]:Charge Phone\n" +
                        "[3]:Send SMS\n" +
                        "[4]:Check Cellphone Status\n" +
                        "[5]:Call\n" +
                        "[6]:Exit Program\n" +
                        "Select: "
            )
            var input = readln()
            if (input.toInt() > 6 || input.toInt() < 1) {
                println("Invalid Input/Out of Range. Please Try again")
                break
            } else if (input == "1") {
                buyLoad()
            } else if (input == "2") {
                chargeBattery()
            } else if (input == "3") {
                sendText()
            } else if (input == "4") {
                checkStatus()
            } else if (input == "5") {
                callminutes()
            } else if (input == "6") {
                println("Exiting ...")
                break
            }else {
                println("Invalid Input!Use 1-6 only.")
            }
            print("Go to Main Menu?Y/N: ")
            var ask = readln()
            if (ask =="y"||ask=="Y"){
            }else if (ask =="n"||ask=="N") {
                break
            }
        }
        println("Thank you!")
    }
}

