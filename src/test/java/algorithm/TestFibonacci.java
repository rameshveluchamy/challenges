package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class TestFibonacci {

    @Test
    public void testFibonacci() {
        int[] result = {1, 1, 2};
        Assert.assertEquals(result, Fibonacci.generateFibonacci(3));
    }
}
