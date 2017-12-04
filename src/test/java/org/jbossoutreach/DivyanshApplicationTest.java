package org.jbossoutreach;
import org.junit.Assert;
import org.junit.Test;

public class DivyanshApplicationTest {
	int val1 = 20;
	int val2 = 6;
	String string1 = "Jboss";
	String string2 = "Community";	

    @Test
    public void sampleTest() {
        System.out.println("@Test - test_method_1");
    }
    
    @Test
    public void isTrue() {
    	Assert.assertTrue((val1*val2)==120);		//returns the result(boolean) of the statement, true if statement is true
    	
    }
    
    @Test
    public void isFalse() {
    	Assert.assertFalse((val1-val2)==12);		//returns the result(boolean) of the statement, true if statement is false    	
    }
    
    @Test
    public void addsTwo(){							//checks if the calculated value is equal to the actual value
    	int total = val1+val2;
    	Assert.assertEquals(total,26);
    }
    
    @Test
    public void sameOrNot(){
    	Assert.assertNotSame(string1,string2);    			//checks whether they are "not same"
    }
    
    @Test
    public void areArraysEqual() {
    	int [] array1 = {2,4,6,8,10};
    	int [] array2 = {2,4,6,8,10};
    	Assert.assertArrayEquals(array1,array2);     //checks whether the arrays are equal
    }
}
