fun main(){
    //Map = Keys and value / Immutable
    var map = mapOf(1 to "Peter", 2 to "Paul", 3 to "Mary")
    //value
    println(map[1])//peter
    println(8)//result is null because out of range
    println(map.get(2))
    // display keys
    for (key in map.keys){
        println(key)

    }
    //transverse
    for (key in map.values) {
        println(key)
    }
    //-------------------------------------------------
    // Mutable map
    var map2 = mutableMapOf<Int,String>()
    //add value
    map2.put(2,"John")
    println(map2)
    //remove element
    map2.remove(2)
    println(map2)
}