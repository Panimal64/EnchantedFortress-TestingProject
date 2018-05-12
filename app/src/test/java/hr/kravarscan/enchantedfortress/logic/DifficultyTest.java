package hr.kravarscan.enchantedfortress.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class DifficultyTest {

    Difficulty test = new Difficulty(200,20,10);

    @Test
    public void testPop(){

        double testPop = test.getStartingPop();
        assertEquals(200,testPop,.01);
    }

    @Test
    public void testSpawn(){
        double testSpawn = test.getDemonSpawnFactor();
        assertEquals(testSpawn,20,.01);
    }

    @Test
    public void testPower(){
        double testPower = test.getDemonPowerBase();
        assertEquals(testPower,10,.01);
    }

}