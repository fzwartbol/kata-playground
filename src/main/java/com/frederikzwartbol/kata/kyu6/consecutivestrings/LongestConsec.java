package com.frederikzwartbol.kata.kyu6.consecutivestrings;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * You are given an array(list) strarr of strings and an integer k.
 * Your task is to return the first longest string consisting of k consecutive strings taken in the array.
 */
class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        return strarr.length == 0 || k > strarr.length || k <= 0 ? "" :
                IntStream.range(0, strarr.length-k+1).mapToObj(i ->
            IntStream.range(0, k).mapToObj(j -> strarr[i+j]).collect(Collectors.joining(""))
        ).max(Comparator.comparingInt(String::length)).orElse("");
    }
}
