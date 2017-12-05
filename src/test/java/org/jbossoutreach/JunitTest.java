package org.jbossoutreach;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JunitTest {
    private int fNum = 10;
    private int sNum = 20;

    @Test
    public void sampleTest() {
        System.out.println("@Test - test_method_1");
    }


    @Test
    public void assertEqualTest(){
        Assert.assertEquals(sNum-fNum,10);
    }

    @Test
    public void assertTrueTest(){
        Assert.assertTrue(fNum==10);
    }

    @Test
    public void assertFalseTest(){
        Assert.assertFalse(sNum==10);
    }

    @Test
    public void assertArrayEqualsTest(){
        List<Integer> data = new ArrayList<>();
        for(int i=0;i<5;i++){
            data.add(i);
        }
        List<Integer> excepted = new ArrayList<>();
        excepted.add(0);
        excepted.add(1);
        excepted.add(2);
        excepted.add(3);
        excepted.add(4);
        Assert.assertArrayEquals(data.toArray(new Integer[data.size()]),excepted.toArray(new Integer[excepted.size()]));
    }

    @Test
    public void assertNotSameTest(){
        String fString = "Hello World";
        String sString = "Bye World";
        Assert.assertNotEquals(fString,sString);
    }

}
