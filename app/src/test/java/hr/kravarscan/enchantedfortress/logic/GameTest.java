package hr.kravarscan.enchantedfortress.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Difficulty diff = new Difficulty(10,10,10);
    Game testGame = new Game(diff);

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
    }

    @Test
    public void selectTech() {
    }

    @Test
    public void roundedPop() {
    }

    @Test
    public void realDeltaPop() {
    }

    @Test
    public void deltaWalls() {
    }

    @Test
    public void militaryStrength() {
    }

    @Test
    public void deltaResearch() {
    }

    @Test
    public void isOver() {
    }

    @Test
    public void isPlayerAlive() {
    }

    @Test
    public void endTurn() {
    }

    @Test
    public void save() {
    }

    @Test
    public void load() {
    }
}