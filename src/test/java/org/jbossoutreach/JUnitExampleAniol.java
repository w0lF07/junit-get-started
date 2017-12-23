package org.jbossoutreach;
import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;


public class JUnitExampleAniol {
    @Test
    public void assert_True()
    {
        int s = 8 + 2;         
        Assert.assertTrue(s == 10);
    }
    @Test
    public void assert_False()
    {
        int s = 6 - 4;
        Assert.assertFalse(s == 0);
    }
    @Test
    public void assert_Equals()
    {
        int e = 18 / 3;
        Assert.assertEquals(e, 6);
    }
    @Test
    public void assert_Array_Equals()
    {
        int a1[]={4,5,6};
        int a2[]={4,5,6};
        Assert.assertArrayEquals(a1 ,a2);
    }

    @Test
    public void assert_notnull()
    {
        int i = 9;
        Assert.assertNotNull(i);
    }
}

