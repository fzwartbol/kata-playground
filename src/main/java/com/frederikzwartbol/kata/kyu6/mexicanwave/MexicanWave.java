package com.frederikzwartbol.kata.kyu6.mexicanwave;

import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;


/**
 * Task
 * In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
 * Rules
 *  1.  The input string will always be lower case but maybe empty.
 *
 *  2.  If the character in the string is whitespace then pass over it as if it was an empty seat
 *  */

public class MexicanWave {
    public static String[] wave(String str) {
             return  IntStream.range(1,str.length()+1).mapToObj(
                        i -> str.charAt(i-1) != ' ' ? str.substring(0,i-1) + str.substring(i-1, i).toUpperCase() + str.substring(i) : ' ').collect(toList())
                        .stream().filter( s -> !s.equals(' '))
                        .toArray(String[]::new);

    }
}
