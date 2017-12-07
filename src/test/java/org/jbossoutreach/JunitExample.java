package org.jbossoutreach;
import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;


public class JunitExample {
    @Test
    public void assert_True()
    {
        int s = 1 + 2;         
        Assert.assertTrue(s == 3);
    }
    @Test
    public void assert_False()
    {
        int s = 3 - 2;
        Assert.assertFalse(s == 0);
    }
    @Test
    public void assert_Equals()
    {
        int d = 5 / 5;
        Assert.assertEquals(d, 1);
    }
    @Test
    public void assert_Array_Equals()
    {
        int a1[]={1,2,3};
        int a2[]={1,2,3};
        Assert.assertArrayEquals(a1 ,a2);
    }

    @Test
    public void assert_Not_Null()
    {
        int i = 5;
        Assert.assertNotNull(i);
    }
}
