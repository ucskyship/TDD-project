package exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void acOnTest(){
        AirConditioner acToshiba = new AirConditioner();            //given that I have an AC
        acToshiba.setOn(true);                                      //when I turn it on
        //boolean ucjAC = ucjToshiba.getOnValue();
        assertTrue(acToshiba.getOnValue());                         //check that it is on
    }
    @Test
    public void acOffTest(){

        AirConditioner ucjToshiba = new AirConditioner();           //given that I have an AC
        ucjToshiba.setOn(true);                                     //ac is on
        ucjToshiba.setOn(false);                                    //when I turn it off
        assertFalse(ucjToshiba.getOnValue());                       //check that it is off
    }
    @Test
    public void acIncreaseTemperatureTest(){

        AirConditioner ucjToshiba = new AirConditioner();           //given that I have an AC
        ucjToshiba.setOn(true);                                     //given that my AC is on
        ucjToshiba.setTemperature(16);
        ucjToshiba.increaseTemperature();                              //when I increase the temperature
        assertEquals(17, ucjToshiba.getTemperature());      //check that it is on
    }
    @Test
    public void decreaseTemperatureTest(){
        //given that I have an AC
        AirConditioner ucjToshiba = new AirConditioner();
        ucjToshiba.setOn(true);
        ucjToshiba.setTemperature(16);
        ucjToshiba.decreaseTemperature();
        //check that temperature decreases
        assertEquals(16, ucjToshiba.getTemperature());
    }
    @Test
    public void excessIncreaseTemperatureTest(){
        //given that I have an AC
        AirConditioner ucjToshiba = new AirConditioner();
        ucjToshiba.setOn(true);
        ucjToshiba.setTemperature(30);
        ucjToshiba.increaseTemperature();
        ucjToshiba.increaseTemperature();
        //check that temperature is still 30
        assertEquals(30, ucjToshiba.getTemperature());
    }
    @Test
    public void excessDecreaseTemperature(){
        //given that I have an AC
        AirConditioner ucjToshiba = new AirConditioner();
        ucjToshiba.setOn(true);
        ucjToshiba.setTemperature(16);
        ucjToshiba.decreaseTemperature();
        ucjToshiba.decreaseTemperature();
        //check that temperature is still 16
        assertEquals(16, ucjToshiba.getTemperature());
    }
}
