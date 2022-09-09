fun main (){
    //Sets Does not allow duplicates value and Immutable or Fixed Read only like Array.

    var mySet = setOf(2,3,6,1,2,2,2,2)
    println(mySet.count())// count the elements and do not count duplicate values
    println(mySet.sum())// total of the elements
    for (data in mySet) {
        println(data)
    }

    var setA = setOf(2,5,7,8)
    var setB = setOf(1,3,5,7)
    // union
    println(setA.union(setB))//combining sets elements
    //intersect
    println(setA.intersect(setB))
    //difference
    println(setA.minus(setB))
    println(setB.minus(setA))
//    ---------------------------------------------

//    mutable and can change like arraylist Sets read and write
    var mySet2 = mutableSetOf<Int>()
    mySet2.add(5)
    mySet2.add(7)
    mySet2.add(8)
    mySet2.remove(8)
            for (data in mySet2){
                println(data)
            }
}