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

        double result = test.cost();

        assertEquals(100, result, 1.0);
    }
}