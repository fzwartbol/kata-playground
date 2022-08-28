package com.frederikzwartbol.kata.kyu8.sumofpositive;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class SumOfPositiveTest {
    @Test
    public void testSomething() {
        assertEquals(15, SumOfPositive.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, SumOfPositive.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, SumOfPositive.sum(new int[]{}));
        assertEquals(0, SumOfPositive.sum(new int[]{-1,-2,-3,-4,-5}));
    }
}