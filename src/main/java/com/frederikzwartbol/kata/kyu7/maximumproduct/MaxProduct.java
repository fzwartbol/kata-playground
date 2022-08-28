package com.frederikzwartbol.kata.kyu7.maximumproduct;

import java.util.stream.IntStream;

/**
 * Task
 * Given an array of integers , Find the maximum product obtained from multiplying 2 adjacent numbers in the array.
 */
public class MaxProduct {
    public int adjacentElementsProduct(int[] array) {
        return IntStream.range(0,array.length-1).mapToObj(i -> array[i]*array[i+1]).toList()
                .stream().max(Integer::compareTo).get();
    }
}