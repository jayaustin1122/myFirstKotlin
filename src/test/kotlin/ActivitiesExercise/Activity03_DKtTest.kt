package ActivitiesExercise
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
internal class Activity03_DKtTest{
    //add napkin
    @Test
    fun checkAddNapkin(){
        var check = Grocery1()
        assertEquals("Napkin",check.addItem("Napkin",12.0,3))
    }
    //add Tissue
    @Test
    fun checkAddTissue(){
        var check = Grocery1()
        assertEquals("Tissue",check.addItem("Tissue",10.0,5))
    }
    //add Soap
    @Test
    fun checkAddSoap(){
        var check = Grocery1()
        assertEquals("Soap",check.addItem("Soap",15.0,12))
    }
    //add Toothbrush
    @Test
    fun checkAddToothBrush(){
        var check = Grocery1()
        assertEquals("Toothbrush",check.addItem("Toothbrush",15.0,12))
    }
}
