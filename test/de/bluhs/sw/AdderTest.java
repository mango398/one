package de.bluhs.sw;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: bluhs
 * Date: 02.02.2018
 * Time: 15:12
 */
public class AdderTest {
    @Test
    public void testPositive() {
        Adder tester = new Adder();

        assertEquals(2.0, (double) tester.addIntegers(1,1), 0);
        assertEquals(9.0, (double) tester.addIntegers(4,5), 0);
        assertEquals(1.0, (double) tester.addIntegers(0,1), 0);
        assertEquals(-2.0, (double) tester.addIntegers(-1,-1), 0);

        Assert.assertTrue(true);
    }

}