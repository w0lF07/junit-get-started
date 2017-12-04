package org.jbossoutreach;

import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;
import java.util.*;

public class JagreetDGApplicationTest {
	
    @Test
    public void sampleTest() {
        System.out.println("@Test - test_method_1");
    }

    @Test
    public void testAssertTrue() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(9);
        Assert.assertTrue("Should contain List element : 5", list.contains(5));
        //Fail Case : Uncomment to test
        //Assert.assertTrue("Should contain List element : 6",list.contains(6));
    }

    @Test
    public void testAssertFalse() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(9);
        Assert.assertFalse("Shouldn't contain List element : 6", list.contains(6));
        //Fail Case : Uncomment to test
        //Assert.assertFalse("Should'nt contain List element : 5",list.contains(5));
    }

    @Test
    public void testAssertEquals() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(5, 10);
        map.put(7, 14);
        map.put(9, 18);
        Assert.assertEquals("Should Equal 14", (Object) 14, map.get(7));
        //Fail Case : Uncomment to test
        //Assert.assertEquals("Should Equal 18",(Object)14,map.get(5));
    }

    @Test
    public void testAssertNull() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(5, 10);
        map.put(7, 14);
        map.put(9, 18);
        Assert.assertNull("Should return null", map.get(8));
        //Fail Case : Uncomment to test
        //Assert.assertNull("Should return null",map.get(7));
    }

    @Test
    public void testAssertSame() {
        Date date = Date.from(Instant.now());
        Date another = Date.from(Instant.now());
        System.out.println("Current Date : " + date);
        Date now = date;
        Assert.assertSame(date, now);
        //Fail Case : Uncomment to test
        //Assert.assertSame(date,another);
    }
}
