package hr.kravarscan.enchantedfortress.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class TechnologyTest {

    @Test
    public void invest() {
    }

    @Test
    public void cost() {
        Technology test = new Technology();

        double LevelExp = 4 / 3.0;
        double Level0Cost = 100;
        double Level = 0;

        double result = test.cost();
        double calculated = Level0Cost * Math.pow(LevelExp, Level);


        assertEquals(calculated, result, 1.0);
    }
}