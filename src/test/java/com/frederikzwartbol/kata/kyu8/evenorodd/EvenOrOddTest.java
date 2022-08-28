package com.frederikzwartbol.kata.kyu8.evenorodd;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class EvenOrOddTest {
    @Test
    public void testEvenOrOdd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals("Even", eoo.even_or_odd(6));
        assertEquals("Odd", eoo.even_or_odd(7));
        assertEquals("Even", eoo.even_or_odd(0));
        assertEquals("Odd", eoo.even_or_odd(-1));
    }
}