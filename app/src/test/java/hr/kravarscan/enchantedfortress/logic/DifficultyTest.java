package hr.kravarscan.enchantedfortress.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class DifficultyTest {

    Difficulty test;

    //grabbing difficulty
    Difficulty difficulty = test.Medium;

    @Test
    public void testPop(){

        double testPop = difficulty.getStartingPop();
        assertEquals(100,testPop,.01);
    }

    @Test
    public void testSpawn(){
        double testSpawn = difficulty.getDemonSpawnFactor();
        assertEquals(testSpawn,1,.01);
    }

    @Test
    public void testPower(){
        double testPower = difficulty.getDemonPowerBase();
        assertEquals(testPower,1.02,.01);
    }

    @Test
    //this test the getindex which sees where the medium difficulty
    // in in the level array
    public void testGetIndex() {
        int index = difficulty.getIndex();
        assertNotEquals(2,index);
    }

}