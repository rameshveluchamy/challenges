package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class TestPalindrome {

    @Test
    public void testIsPalindrome1() {
        String val = "MADAM";
        boolean expected = true;

        Assert.assertEquals(expected, Palindrome.isPalindrome(val));
    }

    @Test
    public void testIsPalindrome2() {
        String val = "MADAME";
        boolean expected = false;

        Assert.assertEquals(expected, Palindrome.isPalindrome(val));
    }
}
