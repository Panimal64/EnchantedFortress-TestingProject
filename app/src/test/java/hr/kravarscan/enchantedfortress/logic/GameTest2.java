package hr.kravarscan.enchantedfortress.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest2 {
    @Test
    public void getDiff(){
        Difficulty diff = new Difficulty(10, 10,10);
        Game test = new Game(diff);

        double startPop = test.getDifficulty().getStartingPop();
        assertEquals(10.0, startPop,.01);

        double spawnFact = test.getDifficulty().getDemonSpawnFactor();
        assertEquals(10.0, spawnFact, .01);

        double powerBase = test.getDifficulty().getDemonPowerBase();
        assertEquals(10.0,powerBase,.01);

        System.out.println("Starting Population: " + startPop);
        System.out.println("Spawn Factor: " + spawnFact);
        System.out.println("Demon Power Base: " + powerBase);

    }

}