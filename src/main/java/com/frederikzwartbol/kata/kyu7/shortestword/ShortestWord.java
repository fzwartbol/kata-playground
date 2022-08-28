package com.frederikzwartbol.kata.kyu7.shortestword;

import java.util.Arrays;


/**
 * Simple, given a string of words, return the length of the shortest word(s).
 *
 * String will never be empty and you do not need to account for different data types.
 */
public class ShortestWord {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).map( str -> str.length()).min(Integer::compareTo).get();

    }
}
