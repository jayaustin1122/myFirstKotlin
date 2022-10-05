package ActivitiesExercise
import com.exercises.Grocery1
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
internal class Activity03_DKtTest{
    //com.tutorials.add napkin
    @Test
    fun checkAddNapkin(){
        var check = Grocery1()
        assertEquals("Napkin",check.addItem("Napkin",12.0,3))
    }
    //com.tutorials.add Tissue
    @Test
    fun checkAddTissue(){
        var check = Grocery1()
        assertEquals("Tissue",check.addItem("Tissue",10.0,5))
    }
    //com.tutorials.add Soap
    @Test
    fun checkAddSoap(){
        var check = Grocery1()
        assertEquals("Soap",check.addItem("Soap",15.0,12))
    }
    //com.tutorials.add Toothbrush
    @Test
    fun checkAddToothBrush(){
        var check = Grocery1()
        assertEquals("Toothbrush",check.addItem("Toothbrush",15.0,12))
    }
}
