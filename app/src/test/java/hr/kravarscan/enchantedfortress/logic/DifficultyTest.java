package hr.kravarscan.enchantedfortress.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class DifficultyTest {

    Difficulty test;

    //grabbing difficulty
    Difficulty medium = test.Medium;
    @Test
    public void testPop(){

        double testPop = medium.getStartingPop();
        assertEquals(100,testPop,.01);
    }

    @Test
    public void testSpawn(){
        double testSpawn = medium.getDemonSpawnFactor();
        assertEquals(testSpawn,1,.01);
    }

    @Test
    public void testPower(){
        double testPower = medium.getDemonPowerBase();
        assertEquals(testPower,1.02,.01);
    }

    @Test
    //this test the getindex which sees where the medium difficulty
    // in in the level array
    public void testGetIndex() {
        int index = medium.getIndex();
        assertNotEquals(2,index);
    }

    @Test
    public void easyNotMedium() {
        Difficulty[] levels = test.Levels;
        Difficulty easy = levels[0];
        assertNotSame(easy, medium);
    }

    @Test
    public void easyPowerDifferent() {
        Difficulty[] levels = test.Levels;
        Difficulty easy = levels[0];
        double easyPop = easy.getStartingPop();
        double medPop = medium.getStartingPop();
        assertNotSame(medPop,easyPop);
    }
}