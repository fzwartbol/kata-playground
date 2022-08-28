package com.frederikzwartbol.kata.kyu7.numbersinorder;


import java.util.stream.IntStream;

public class NumbersInOrder {

    public static boolean isAscOrder(int[] arr) {
            return !IntStream.range(0, arr.length-1).mapToObj(i -> arr[i] > arr[i+1] ? false : true).toList().contains(false);
    }
}
