
package org.jbossoutreach;
import org.junit.Assert;
import org.junit.Test;

public class SachinRTest{

int num1 = 10;
int num2 = 20;
int sum = 30;
String string1 = "Sachin";
String string2 = "JBoss";
	

    @Test
    public void sampleTest() {
        System.out.println("@Test - test_method_1");
    } 


    @Test
    public void numOneNumTwoTwice() {
        int sumTwoTimes = num1+num1+num2+num2;
        Assert.assertEquals(sumTwoTimes, 60);
    }

    @Test
    public void numOnePlusNumTwoIsTrue(){
        Assert.assertTrue((num1+num2)==sum);
    }



    @Test
    public void numOneMinusNumTwoIsFalse(){
        Assert.assertFalse((num2-num1)==sum);
    }



    @Test
    public void stringsNotSame(){
        Assert.assertNotSame(string1, string2);
    }

    @Test
    public void numberSeriesArrayCheck() {
        int[] seriesOne = {10, 11, 12, 13};
        int[] seriesTwo = {10, 11, 12, 13};
        Assert.assertArrayEquals(seriesOne, seriesTwo);
    }


}
