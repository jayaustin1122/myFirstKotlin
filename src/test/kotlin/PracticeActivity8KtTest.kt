import ActivitiesExercise.NumberComparator
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


internal class PracticeActivity8KtTest{
    //test cases.
    //(1) if 5,3,1 entered, return 5
    @Test
    fun fiveThreeOneIsEnteredReturnFive(){
        var numComparator = NumberComparator()
        assertEquals(5,numComparator.maxNumber(5,3,1))
    }
    //(2) if 1,5,2 entered, return 5
    @Test
    fun oneFiveTwoIsEnteredReturnFive(){
        var numComparator = NumberComparator()
        assertEquals(5,numComparator.maxNumber(1,5,2))
    }
    //(3) if 2,5,7 entered, return 7
    @Test
    fun twoFiveSevenIsEnteredReturnSeven(){
        var numComparator = NumberComparator()
        assertEquals(7,numComparator.maxNumber(2,5,7))
    }
    //(4) all numbers are the same.
    @Test
    fun allNumbersAreEqual(){
        var numComparator = NumberComparator()
        assertEquals(2,numComparator.maxNumber(2,2,2))
    }
    //(5) 2,2,7 return 7
    @Test
    fun twoTwoSevenIsEnteredReturntwo(){
        var numComparator = NumberComparator()
        assertEquals(7,numComparator.maxNumber(2,2,7))
    }
    //(6) 2,2,1 return 2
    @Test
    fun twoTwoOneIsEnteredReturntwo(){
        var numComparator = NumberComparator()
        assertEquals(2,numComparator.maxNumber(2,2,1))
    }
    //(7) 7,5,5 return 7
    @Test
    fun sevenFiveFiveReturnSeven(){
        var numComparator = NumberComparator()
        assertEquals(7,numComparator.maxNumber(7,5,5))
    }
    //(8) 1,5,5 return 5
    @Test
    fun oneFiveFiveIsEnteredReturnFive(){
        var numComparator = NumberComparator()
        assertEquals(5,numComparator.maxNumber(1,5,5))
    }

}