fun main(){
        // immutable or fixed Read only.
    var myList = listOf(2,5,3,1)
    //display
    println(myList[0])
    //DISPLAY SIZE
    println(myList.size)// count of the elements store = 4

    //Traverse
    for (ListValue in myList) {
        println(ListValue)
    }

    //--------------------------------------------------
    //List mutablelistOf changeable
    var myList1 = mutableListOf<Int>()
    myList1.add(7)
    myList1.add(8)
    myList1.add(9)
    for (i in myList1)
        println(i)
}