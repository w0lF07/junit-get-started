package org.jbossoutreach;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * A few simple unit tests for addition.
 */
public class ZwliewTest {

    /**
     * Tests the commutative property of addition.
     * Demonstrates {@code Assert.assertTrue}.
     */
    @Test
    public void testCommutativeProperty() {
        final int testCases[] = {
                3 + 9 + 2,
                3 + 2 + 9,
                9 + 3 + 2,
                9 + 2 + 3,
                2 + 3 + 9,
                2 + 9 + 3,
        };
        Assert.assertTrue(Arrays.stream(testCases)
                .allMatch((testCase) -> testCase == testCases[0]));
    }

    /**
     * Tests the associative property of addition.
     * Demonstrates {@code Assert.assertEquals}.
     */
    @Test
    public void testAssociativeProperty() {
        final int testCases[] = {
                3 + (9 + 2),
                (3 + 9) + 2,
        };
        Assert.assertEquals(testCases[0], testCases[1]);
    }

    /**
     * Tests the identity property of addition.
     * Demonstrates {@code Assert.assertFalse}.
     */
    @Test
    public void testIdentityProperty() {
        final int testCases[] = {
                1,
                9,
        };
        Assert.assertFalse(Arrays.stream(testCases)
                .anyMatch((testCase) -> testCase + 0 != testCase));
    }

    /**
     * Tests the distributive property of addition.
     * Demonstrates {@code Assert.assertArrayEquals}.
     */
    @Test
    public void testDistributiveProperty() {
        final int expected[] = {
                (3 + 5) * 6,
                (7 + 2) * 3,
                (17 + 34) * 2,
        };
        final int actual[] = {
                3 * 6 + 5 * 6,
                7 * 3 + 2 * 3,
                17 * 2 + 34 * 2,
        };
        Assert.assertArrayEquals(expected, actual);
    }

    /**
     * Tests the inverse property of addition.
     * Demonstrates {@code Assert.assertSame}.
     */
    @Test
    public void testInverseProperty() {
        final int testCases[] = {
                73,
                19233,
                342103,
        };
        Assert.assertSame(Arrays.stream(testCases)
                .map((testCase) -> testCase - testCase).sum(), 0);
    }
}
