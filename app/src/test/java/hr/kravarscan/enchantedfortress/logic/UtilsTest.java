package hr.kravarscan.enchantedfortress.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void clamp_x_lessThan_min_shouldPass() {
        Utils test = new Utils();

        double result = test.clamp(10.0, 20.0, 100.0);


        assertEquals(20.0, result,0);
    }

    @Test
    public void clamp_x_greaterThan_max_shouldPass() {
        Utils test = new Utils();

        double result = test.clamp(110.0, 20.0, 100.0);


        assertEquals(100.0, result,0);
    }

    @Test
    public void clamp_x_between_minMax_shouldPass() {
        Utils test = new Utils();

        double result = test.clamp(10.0, 1.0, 100.0);


        assertEquals(10.0, result,0);
    }

    @Test
    public void integerDelta() {
        Utils test = new Utils();
        int result = test.integerDelta(10.0,10.0);

        assertEquals(10, result);
    }
}