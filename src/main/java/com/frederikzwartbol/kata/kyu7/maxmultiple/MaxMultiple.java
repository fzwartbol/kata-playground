package com.frederikzwartbol.kata.kyu7.maxmultiple;

/**
 * Task
 * Given a Divisor and a Bound , Find the largest integer N , Such That ,
 *
 * Conditions :
 * N is divisible by divisor
 *
 * N is less than or equal to bound
 *
 * N is greater than 0.
 */
public class MaxMultiple {
    public static int maxMultiple(int divisor, int bound) {
        return (bound/divisor)*divisor;
    }
}
