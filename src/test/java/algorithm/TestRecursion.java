package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class TestRecursion {

    @Test
    public void testCalculateSuperDigit1() {
        int value = 98;
        int expected = 8;

        Assert.assertEquals(expected, Recursion.calculateSuperDigit(value));

    }
}
