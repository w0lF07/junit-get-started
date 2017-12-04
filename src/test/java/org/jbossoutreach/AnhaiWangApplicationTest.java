package org.jbossoutreach;
import org.junit.Assert;
import org.junit.Test;

public class AnhaiWangApplicationTest {

    private int val1 = 567;
    private int val2 = 233;
    private String str1 = "APPLICATION";
    private String str2 = "TEST";
    private String imNull = null;

    @Test
    public void sampleTest() {
        System.out.println("@Test - test_method_1");
    }

    @Test
    public void testEquals() {
        int sum = val1 + val2;
        Assert.assertEquals(sum, 800);
        Assert.assertEquals(val1 + sum, 1367);
        Assert.assertEquals(val2 + sum, 1033);
    }

    @Test
    public void testTrue() {
        int difference = val1 - val2;
        Assert.assertTrue(difference == 334);
        Assert.assertTrue(val1 - difference == val2);
    }

    @Test
    public void testFalse() {
        int product = val1 * val2;
        Assert.assertFalse(product == 0);
        Assert.assertFalse(product == val1);
        Assert.assertFalse(product == val2);
    }

    @Test
    public void testNull() {
        Assert.assertNull(imNull);
    }

    @Test
    public void testArrayEquals() {
        int[] arrayVals = {val1, val2};
        int[] arrayValsExpected = {567, 233};
        String[] arrayStrs = {str1, str2};
        String[] arrayStrsExpected = {"APPLICATION", "TEST"};
        Assert.assertArrayEquals(arrayVals, arrayValsExpected);
        Assert.assertArrayEquals(arrayStrs, arrayStrsExpected);
    }
}
