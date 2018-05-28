package hr.kravarscan.enchantedfortress.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class TechnologyTest {

    Technology test = new Technology();

    @Test
    public void invest() {
        test.Invest(10);
        double result = test.cost();
        assertNotEquals(100,result);
    }

    @Test
    public void cost() {

        double result = test.cost();
        assertEquals(100, result, 1.0);
    }
}