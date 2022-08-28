package com.frederikzwartbol.kata.kyu7.jadencase;

import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/** *
 * Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
 *
 * Example:
 *
 * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
 * Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 * Note that the Java version expects a return value of null for an empty string or null.
 */

public class JadenCase {
    public String toJadenCase(String phrase) {
        return phrase == null || phrase.length() == 0 ? null :
                Arrays.stream(phrase.split(" ")).toList()
                .stream().map( s -> IntStream.range(0,s.length())
                        .mapToObj( i ->  i == 0 ? String.valueOf(s.charAt(i)).toUpperCase() : String.valueOf(s.charAt(i)))
                        .collect(Collectors.joining(""))).collect(Collectors.joining(" "));
    }
}