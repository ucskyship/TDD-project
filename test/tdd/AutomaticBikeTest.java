package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
    public void automaticBikeOnTest(){
        //given that I have a bike
        AutoBike ucjBike = new AutoBike();
        //when I turn it on
        ucjBike.setWork(true);
        boolean ucjAutoBike = ucjBike.getOnValue();
        //check that it is on
        assertTrue(ucjAutoBike);
    }
    @Test
    public void automaticBikeOffTest(){
        //given tht i have a bike
        AutoBike ucjBike = new AutoBike();
        ucjBike.setWork(true);
        //when I turn it off
        ucjBike.setWork(false);
        //check that it is off
        assertFalse(ucjBike.getOnValue());
    }
    @Test
    public void automaticBikeGearTest(){
        //given that I have a bike
        AutoBike ucjBike = new AutoBike();
        ucjBike.setWork(true);
        ucjBike.engageGear(true);
        assertTrue(ucjBike.getGearStatus());
    }
    @Test
    public void automaticBikeAccelerationTest(){
        //given that I have a bike
        AutoBike ucjBike = new AutoBike();
        ucjBike.setWork(true);
        ucjBike.engageGear(true);
        //when I accelerate
        ucjBike.Accelerate(20);
        //check that it accelerate
        assertEquals(1, ucjBike.getGearNumber());
        assertEquals(21, ucjBike.getIncrement());
    }
    @Test
    public void automaticBike2ndAccelerationTest(){
        //given that I have a bike
        AutoBike ucjBike = new AutoBike();
        ucjBike.setWork(true);
        ucjBike.engageGear(true);
        //when I accelerate
        ucjBike.Accelerate(30);
        //check that it accelerate
        assertEquals(2, ucjBike.getGearNumber());
        assertEquals(32, ucjBike.getIncrement());
    }
    @Test
    public void automaticBike3rdAccelerationTest(){
        //given that I have a bike
        AutoBike ucjBike = new AutoBike();
        ucjBike.setWork(true);
        ucjBike.engageGear(true);
        //when I accelerate
        ucjBike.Accelerate(40);
        //check that it accelerate
        assertEquals(3, ucjBike.getGearNumber());
        assertEquals(43, ucjBike.getIncrement());
    }
    @Test
    public void automaticBike4thAccelerationTest(){
        //given that I have a bike
        AutoBike ucjBike = new AutoBike();
        ucjBike.setWork(true);
        ucjBike.engageGear(true);
        //when I accelerate
        ucjBike.Accelerate(50);
        //check that it accelerate
        assertEquals(4, ucjBike.getGearNumber());
        assertEquals(54, ucjBike.getIncrement());
    }
    @Test
    public void automaticBikeDecelerationTest(){
        //given that I have a bike
        AutoBike ucjBike = new AutoBike();
        ucjBike.setWork(true);
        ucjBike.engageGear(true);
        //when i  decelerate
        ucjBike.Accelerate(50);
        ucjBike.Decelerate(46);
        //check that it decelerates
        assertEquals(4, ucjBike.getGearNumber());
        assertEquals(42, ucjBike.getDecrement());
    }
    @Test
    public void automaticBike2ndDecelerationTest(){
        //given that i have a bike
        AutoBike ucjBike = new AutoBike();
        ucjBike.setWork(true);
        ucjBike.engageGear(true);
        //when i  decelerate
        ucjBike.Accelerate(40);
        ucjBike.Decelerate(37);
        //check that it decelerates
        assertEquals(3, ucjBike.getGearNumber());
        assertEquals(34, ucjBike.getDecrement());
    }
    @Test
    public void automaticBike3rdDecelerationTest(){
        //given that i have a bike
        AutoBike ucjBike = new AutoBike();
        ucjBike.setWork(true);
        ucjBike.engageGear(true);
        //when i  decelerate
        ucjBike.Accelerate(30);
        ucjBike.Decelerate(28);
        //check that it decelerates
        assertEquals(2, ucjBike.getGearNumber());
        assertEquals(26, ucjBike.getDecrement());
    }
    @Test
    public void automaticBike4thDecelerationTest(){
        //given that i have a bike
        AutoBike ucjBike = new AutoBike();
        ucjBike.setWork(true);
        ucjBike.engageGear(true);
        //when i  decelerate
        ucjBike.Accelerate(20);
        ucjBike.Decelerate(16);
        //check that it decelerates
        assertEquals(1, ucjBike.getGearNumber());
        assertEquals(15, ucjBike.getDecrement());
    }
}
