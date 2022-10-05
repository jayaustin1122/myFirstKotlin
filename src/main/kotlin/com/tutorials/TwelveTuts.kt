package com.tutorials

fun main (){
    var num = arrayOf(
        //0         1           2
        arrayOf<String>("Peter","Paul","Mary"),//0
        arrayOf<String>("John","Mark","Matthew"),//1
        arrayOf<String>("James","Luke","Zarchary"),//2
    )

    var row : Int = 0
    while (row<3){
        var column : Int = 0
        while(column < 3) {
            print("${num[row][column]} ")
            column++
        }
        println()
        row++
    }

}
