package ActivitiesExercise

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Activity03_BKtTest{
    //checking if the user input sure go to the function
    @Test
    fun checkOfComputations(){
        var check = Amount()
        assertEquals(12.0,check.computeAmount(12.0))
    }
}