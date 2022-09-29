package ActivitiesExercise

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Activity03_BKtTest{
    @Test
    fun checkOfComputations(){
        var check = Amount()
        assertEquals(12.0,check.computeAmount(12.0))
    }
}