package ActivitiesExercise
import Discount
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
internal class PracticeActivity11KtTest{
    //Greater than 0 less than Equal to 10,000 return 0%
    @Test
    fun ten_KDownToZero(){
        var discount = Discount()
        assertEquals(4000.00,discount.discountPrice(4000.00))
    }
    //Greater than 10,000 less than 20,000 return
    @Test
    fun twenty_KDownToTenThousand(){
        var discount = Discount()
        assertEquals(14250.00,discount.discountPrice(15000.00))
    }
    //Greater than 20,000 less than 50,000
    @Test
    fun fifty_KDownTotwentyThousand(){
        var discount = Discount()
        assertEquals(22500.00,discount.discountPrice(25000.00))
    }
    //Greater than 50,000 less than 100,000
    @Test
    fun OneHundred_KDownToFiftyThousand(){
        var discount = Discount()
        assertEquals(63750.00,discount.discountPrice(75000.00))
    }
    //Greater than 100,000 return 20%
    @Test
    fun greaterThanOneHundredThousand(){
        var discount = Discount()
        assertEquals(160000.00,discount.discountPrice(200000.00))
    }
}