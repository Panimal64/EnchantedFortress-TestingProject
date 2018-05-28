package hr.kravarscan.enchantedfortress.logic;

import org.junit.Test;
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

        System.out.println("Population: " + testPop);
        System.out.println("Spawn: " + testSpawn);
        System.out.println("Power: " + testPower);

        assertEquals(testPop,10.0,.01);
        assertEquals(testPower,10.0,.01);
        assertEquals(testSpawn,10.0,.01);

    }

    @Test
    public void getScholarSlider() {

        int sliderTest = testGame.getScholarSlider();
        assertEquals(sliderTest,8);
        System.out.println("Scholar Slider: " + sliderTest);

    }

    @Test
    public void decBuilders() {

    }

    @Test
    public void incBuilders() {
    }

    @Test
    public void decFarmers() {
    }

    @Test
    public void incFarmers() {
    }

    @Test
    public void decSoldiers() {
    }

    @Test
    public void incSoldiers() {
    }

    @Test
    public void getSelectedTech() {
        System.out.println("Selected Tech: " + testGame.getSelectedTech());
        assertEquals(testGame.getSelectedTech(),0);
    }

    @Test
    public void selectTech() {
        testGame.selectTech(1);
        assertEquals(testGame.getSelectedTech(),1);
        System.out.println("New Tech: " + testGame.getSelectedTech());
    }

    @Test
    public void roundedPop() {
        //Don't really need to create a new game object every time
        //See changes made above to how the game was created.
        //Game test = new Game(diff);

        double result = testGame.roundedPop();

        //Where does 10 come from?
        assertEquals(10, result, 0);
        //This should fail now. The expected should be 100
        //The 10 is the population floor as defined when creating 
        //the difficulty

    }
    
/* 
    This is the rounded pop test I had written, not sure why yours comes up with 10 though.
    @Test
    public void roundedPop() {
        System.out.println("Rounded Pop: " + testGame.roundedPop());
        assertEquals(testGame.roundedPop(),100.0,.01);
    }
*/

   @Test
    public void realDeltaPop() {
        System.out.println("Real Delta Pop: " + testGame.realDeltaPop());
        assertEquals(testGame.realDeltaPop(),2);
    }

    @Test
    public void deltaWalls() {
        System.out.println("Delta Walls: " + testGame.deltaWalls());
        assertEquals(testGame.deltaWalls(),0,.01);
    }

    @Test
    public void militaryStrength() {
        System.out.println("Military Strength: " + testGame.militaryStrength());
        assertEquals(testGame.militaryStrength(),100.0,.01);
    }

    @Test
    public void deltaResearch() {
        System.out.println("Delta Research: " + testGame.deltaResearch());
        assertEquals(testGame.deltaResearch(),46.0,.01);
    }

    @Test
    public void isOver() {
        System.out.println("Game over: " + testGame.isOver());
        assertEquals(testGame.isOver(),false);
    }

    @Test
    public void isPlayerAlive() {
        System.out.println("Player Alive: " + testGame.isPlayerAlive());
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

    }
    @Test
    public void save() {
    }

    @Test
    public void load() {
    }


}
