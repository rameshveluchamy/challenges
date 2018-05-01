package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class TestBubbleSort {

    @Test
    public void testBubbleSort1() {
        int[] val = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};

        Assert.assertArrayEquals(expected, BubbleSort.bubbleSort(val));
    }

    @Test
    public void testBubbleSort2() {
        int[] val = {4, 5, 1, 6, 7, 3, 8, 2};
        final int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};

        Assert.assertArrayEquals(expected, BubbleSort.bubbleSort(val));
    }
}
