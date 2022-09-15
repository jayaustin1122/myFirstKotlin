fun main(){
    var joe = Person("Joe",21)
    println("*************")
    println("${joe.name}'s current age is ${joe.name}")
    println("After 1 Year")
    joe.ageUp()
    println("${joe.name}'s current age is ${joe.name}")

}
class Person(var name: String ,var age :Int){
    init {
        println("Object Created")
        println("Name is $name")
        println("Age is $age")
    }
    fun walk(){
        println("A Person Walks")
    }
    fun eat(){
        println("A Person Eats")
    }
    fun displayAge(){
        println(age)
    }
    fun ageUp(){
        age++
    }
}