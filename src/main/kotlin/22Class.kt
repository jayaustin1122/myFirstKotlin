fun main(){
//    //Objects
//    var joe = Person()
//    //re assigning value
//    joe.name = "Joe"
//    //calling object
//    println(joe.name)//joe
//
//    var ana = Person()
//    println(ana.name)
    var joe = Person("Joe",21)


}
//class
class Person1(var name:String,var age :Int) {    //constructor
    //Attributes
//    var name: String = "John"
//    var age: Int = 21
    //Behaviors
    fun walk(){
        println("A Person Walks")
    }
    fun eat(){
        println("A Person Eats")
    }
}