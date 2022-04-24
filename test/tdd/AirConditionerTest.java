package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void acOnTest(){
        //given that I have an AC
        AirConditioner ucjToshiba = new AirConditioner();
        //when I turn it on
        ucjToshiba.setWork(true);
        boolean ucjAC = ucjToshiba.getOnValue();
        //check that it is on
        assertTrue(ucjAC);
    }
    @Test
    public void acOffTest(){
        //given that I have an AC
        AirConditioner ucjToshiba = new AirConditioner();
        //ac is on
        ucjToshiba.setWork(true);
        //when I turn it off
        ucjToshiba.setWork(false);
        //check that it is off
        assertFalse(ucjToshiba.getOnValue());
    }
    @Test
    public void acIncreaseTemperatureTest(){
        //given that I have an AC
        AirConditioner ucjToshiba = new AirConditioner();
        ucjToshiba.setWork(true);
        ucjToshiba.setTemperature(16);
        //when I increase the temperature
        ucjToshiba.setTemperature(30);
        //check that it is on
        assertEquals(30, ucjToshiba.getTemperature());
    }
    @Test
    public void decreaseTemperatureTest(){
        //given that I have an AC
        AirConditioner ucjToshiba = new AirConditioner();
        ucjToshiba.setWork(true);
        ucjToshiba.setTemperature(30);
        ucjToshiba.setTemperature(17);
        //check that temperature decreases
        assertEquals(17, ucjToshiba.getTemperature());
    }
    @Test
    public void excessIncreaseTemperatureTest(){
        //given that I have an AC
        AirConditioner ucjToshiba = new AirConditioner();
        ucjToshiba.setWork(true);
        ucjToshiba.setTemperature(30);
        ucjToshiba.setTemperature(33);
        //check that temperature is still 30
        assertEquals(30, ucjToshiba.getTemperature());
    }
    @Test
    public void excessDecreaseTemperature(){
        //given that I have an AC
        AirConditioner ucjToshiba = new AirConditioner();
        ucjToshiba.setWork(true);
        ucjToshiba.setTemperature(16);
        ucjToshiba.setTemperature(12);
        //check that temperature is still 16
        assertEquals(16, ucjToshiba.getTemperature());
    }
}
