package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class TestSearch {

    final int[] sortedArray = {1, 3, 7, 8, 10, 12, 23, 34, 67, 88};

    @Test
    public void test_binarySearch1() {
        int val = 1;
        Assert.assertEquals(Search.RESULT.FOUND, Search.binarySearch(sortedArray, val));
    }

    @Test
    public void test_binarySearch2() {
        int val = 88;
        Assert.assertEquals(Search.RESULT.FOUND, Search.binarySearch(sortedArray, val));
    }

    @Test
    public void test_binarySearch6() {
        int val = 7;
        Assert.assertEquals(Search.RESULT.FOUND, Search.binarySearch(sortedArray, val));
    }

    @Test
    public void test_binarySearch7() {
        int val = 67;
        Assert.assertEquals(Search.RESULT.FOUND, Search.binarySearch(sortedArray, val));
    }

    @Test
    public void test_binarySearch3() {
        int val = 90;
        Assert.assertEquals(Search.RESULT.NOT_FOUND, Search.binarySearch(sortedArray, val));
    }

    @Test
    public void test_binarySearch4() {
        int val = 0;
        Assert.assertEquals(Search.RESULT.NOT_FOUND, Search.binarySearch(sortedArray, val));
    }

    @Test
    public void test_binarySearch5() {
        int val = 13;
        Assert.assertEquals(Search.RESULT.NOT_FOUND, Search.binarySearch(sortedArray, val));
    }

    //Linear Search
    @Test
    public void test_LinearSearch1() {
        int val = 1;
        Assert.assertEquals(Search.RESULT.FOUND, Search.linearSearch(sortedArray, val));
    }

    @Test
    public void test_LinearSearch2() {
        int val = 88;
        Assert.assertEquals(Search.RESULT.FOUND, Search.linearSearch(sortedArray, val));
    }

    @Test
    public void test_LinearSearch3() {
        int val = 90;
        Assert.assertEquals(Search.RESULT.NOT_FOUND, Search.linearSearch(sortedArray, val));
    }

    @Test
    public void test_LinearSearch4() {
        int val = 0;
        Assert.assertEquals(Search.RESULT.NOT_FOUND, Search.linearSearch(sortedArray, val));
    }

    @Test
    public void test_LinearSearch5() {
        int val = 13;
        Assert.assertEquals(Search.RESULT.NOT_FOUND, Search.linearSearch(sortedArray, val));
    }
}
