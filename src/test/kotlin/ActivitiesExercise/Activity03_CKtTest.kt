package ActivitiesExercise
import MiniLibrary
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Activity03_CKtTest{
    /* ---Books---
     1: Trigo
     2: Comic Book
     3: Newspaper
     4: Science*/
    //(1) Borrow Trigo Book
    @Test
    fun borrow_Trigo(){
        var library = MiniLibrary()
        assertEquals(1,library.borrowBooks2(1))
    }
    //(2) Borrow Comic Book
    @Test
    fun borrow_ComicBook(){
        var library = MiniLibrary()
        assertEquals(2,library.borrowBooks2(2))
    }
    //(3) Borrow NewsPaper
    @Test
    fun borrow_NewsPaper(){
        var library = MiniLibrary()
        assertEquals(3,library.borrowBooks2(3))
    }
    //(4) Borrow Science
    @Test
    fun borrow_Science(){
        var library = MiniLibrary()
        assertEquals(4,library.borrowBooks2(4))
    }
}