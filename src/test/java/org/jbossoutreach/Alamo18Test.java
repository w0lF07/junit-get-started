package org.jbossoutreach;

import org.junit.Assert;
import org.junit.Test;

public class Alamo18Test {

    @Test
    public void sampleTest() {
        System.out.println("@Test - test_method_1");
    }


    @Test
    public void fiveTimesTenEqualsFifty() {
        // Expected method return 0, since 10*5 = 50
        Assert.assertEquals(50, Main.multiply(10, 5));
    }

    @Test
    public void ceilTest(){
        double random =  10.3;
        Assert.assertFalse(Math.ceil(random) == 10);
    }

    @Test
    public void uniaryOperatorTest(){
        int number = 8;
        int expected = 9;
        boolean calculate = ++number == expected;
        Assert.assertTrue(calculate);
    }

    @Test
    public void ArrayCompare() {
        int[] original = {1, 2, 6, 9};
        int[] expected = {1, 2, 6, 9};
        Assert.assertArrayEquals(original, expected);
    }

    @Test
    public void ObjectCompare(){
        Main mainObj1 = new Main();
        Main mainObj2 = new Main();
        Assert.assertSame(mainObj1, mainObj2);
    }

}
