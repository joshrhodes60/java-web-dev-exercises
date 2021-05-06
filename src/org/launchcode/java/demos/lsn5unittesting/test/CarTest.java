package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CarTest {
    Car testCar;

    @Before
    public void createCar() {
         testCar = new Car ("Toyota", "Prius", 10, 50);
    }


    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10, 10, 8);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {

        assertEquals(10, testCar.getGasTankLevel(), 8);

    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        testCar.drive(58);
        assertEquals(9, testCar.getGasTankLevel(), 8);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void getGasTankLevelAccurateDrivingPastRange() {
        testCar.drive(400);
        System.out.println(testCar.getGasTankLevel());
    }


    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverFillException(){
        testCar.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }
}

