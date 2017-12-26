package org.jbossoutreach;
import org.junit.Assert;
import org.junit.Test;

public class W0LF07_JUnit_Tests.java
{

    private int a = 10;
    private int b = 7;
    private String s1 = "SWASTIK";
    private String s2 = "DAS";
    private String null1 = null;

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
        Assert.assertFalse(prod == a);
        Assert.assertFalse(prod == b);
    }

    @Test
    public void testNull()
    {
        Assert.assertNull(null1);
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
