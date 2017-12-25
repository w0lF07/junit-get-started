package org.jbossoutreach;
import org.junit.Assert;
import org.junit.Test;

public class JUnit_tests
{

    int a = 10;
    int b = 7;
    String s1 = "SWASTIK";
    String s2 = "DAS";
    String Null1 = null;

    @Test
    public void testEquals()
    {
        int sum = a + b;
        Assert.assertEquals(sum, 17);
        Assert.assertEquals(a + sum, 27);
        Assert.assertEquals(b + sum, 24);
    }

    @Test
    public void testTrue()
    {
        int diff = a - b;
        Assert.assertTrue(diff == 3);
        Assert.assertTrue(a - diff == b);
    }

    @Test
    public void testFalse()
    {
        int prod = a * b;
        Assert.assertFalse(prod == 0);
        Assert.assertFalse(prod == val1);
        Assert.assertFalse(prod == val2);
    }

    @Test
    public void testNull()
    {
        Assert.assertNull(Null1);
    }

    @Test
    public void sampleTest()
    {
        System.out.println("@Test - test_method");
    }

    @Test
    public void testArrayEquals()
    {
        int[] arrayVals = {a, b};
        int[] arrayValsExpected = {10, 7};
        String[] arrayStrs = {s1, s2};
        String[] arrayStrsExpected = {"SWASTIK", "DAS"};
        Assert.assertArrayEquals(arrayVals, arrayValsExpected);
        Assert.assertArrayEquals(arrayStrs, arrayStrsExpected);
    }
}
