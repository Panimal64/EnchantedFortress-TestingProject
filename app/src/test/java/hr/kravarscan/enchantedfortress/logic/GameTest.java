package hr.kravarscan.enchantedfortress.logic;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class GameTest {
    
    //To get around the private method stuff
    Difficulty diff;
    Difficulty testDiff = diff.Medium;
    Game testGame= new Game(testDiff);

    @Test
    public void getDifficulty() {
        double testPop = testGame.getDifficulty().getStartingPop();
        double testSpawn = testGame.getDifficulty().getDemonSpawnFactor();
        double testPower = testGame.getDifficulty().getDemonPowerBase();

        assertEquals(100.0,testPop,.01);
        assertEquals(1.02,testPower,.01);
        assertEquals(1.0,testSpawn,.01);
    }

    @Test
    public void getScholarSlider() {
        int sliderTest = testGame.getScholarSlider();
        assertEquals(sliderTest,8);
    }

    @Test
    public void decBuilders() {
        for(int i = 0; i < 2; i++){
            testGame.incBuilders();
        }
        testGame.decBuilders();
        double builders = testGame.builderSlider;
        assertEquals(3.0, builders, .01);
    }

    @Test
    public void incBuilders() {
        testGame.incBuilders();
        double builders = testGame.builderSlider;
        assertEquals(3.0, builders, .01);
    }

    @Test
    public void decFarmers() {
        testGame.decFarmers();
        double farmers = testGame.farmerSlider;
        assertEquals(9.0, farmers, .01);
    }

    @Test
    public void incFarmers() {
        testGame.incFarmers();
        double farmers = testGame.farmerSlider;
        assertEquals(11.0, farmers, .01);
    }

    @Test
    public void decSoldiers() {
        for(int i = 0; i < 5; i++){
            testGame.incSoldiers();
        }
        testGame.decSoldiers();
        double soldiers = testGame.soldierSlider;
        assertEquals(4.0, soldiers, .01);
    }

    @Test
    public void incSoldiers() {
        testGame.incSoldiers();
        double soldiers = testGame.soldierSlider;
        assertEquals(1.0, soldiers, .01);
    }

    @Test
    public void getSelectedTech() {
        assertEquals(testGame.getSelectedTech(),0);
    }

    @Test
    public void selectTech() {
        testGame.selectTech(1);
        assertEquals(testGame.getSelectedTech(),1);
    }

    @Test
    public void roundedPop() {
        double result = testGame.roundedPop();
        assertEquals(100, result, 0);
    }

   @Test
    public void realDeltaPop() {
        assertEquals(testGame.realDeltaPop(),2);
    }

    @Test
    public void deltaWalls() {
        assertEquals(testGame.deltaWalls(),0,.01);
    }

    @Test
    public void militaryStrength() {
        assertEquals(testGame.militaryStrength(),100.0,.01);
    }

    @Test
    public void deltaResearch() {
        assertEquals(testGame.deltaResearch(),46.0,.01);
    }

    @Test
    public void isOver() {
        assertEquals(testGame.isOver(),false);
    }

    @Test
    public void isPlayerAlive() {
        assertEquals(testGame.isPlayerAlive(),true);
    }

    @Test
    public void endTurnIncrease() {
       int turn = testGame.turn;
       testGame.endTurn();
       int turnAfterEndTurn = testGame.turn;
       assertNotEquals(turn,turnAfterEndTurn);
    }

    @Test
    public void PopChangeEndTurn() {
       double initalPop = testGame.roundedPop();
       testGame.endTurn();
       double finalPop = testGame.roundedPop();
       assertNotEquals(initalPop, finalPop);
    }

    @Test
    public void wallsChangeEndTurn() {
       //unless make walls manually this test still needs some work
       double initialWall = testGame.walls;
       testGame.demonGates = 10000000;
       testGame.endTurn();
       double finalWall = testGame.walls;
       assertEquals(initialWall,finalWall, 1.01);

    }
    @Test
    public void savePopulation() {
        double[] data = testGame.save();
        double pop = data[2];
        assertEquals(pop, testGame.roundedPop(),.0001);
    }

    @Test
    public void differentSaves() {
        double[] medData = testGame.save();
        Difficulty Hard = testDiff.Levels[2];
        Game hardGame = new Game(Hard);
        double[] hardData = hardGame.save();
        boolean same = Arrays.equals(medData, hardData);
        assertFalse(same);
    }
    //possible bug with array out of bounds
    @Test
    public void load() {
       //27 instead of 26 otherwise array out of bounds
        double[] load = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        testGame.load(load);
        int lol = testGame.reportAttackers;
        double [] save = testGame.save();
        assertNotSame(load,save);
    }

    @Test
    public void milStrength(){
        double milStr = testGame.militaryStrength();
        assertEquals(100.0, milStr, .01);
    }

}
