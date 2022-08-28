package com.frederikzwartbol.kata.kyu7.mumbling;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Accumul {

    public static String accum(String s) {
        List<Character> characterList = s.chars().mapToObj(c -> (char) c).toList();
        return IntStream.range(0,characterList.size())
                .mapToObj(i -> characterList.get(i).toString().toUpperCase()
                +(characterList.get(i).toString().toLowerCase()).repeat(i) )
                .collect(Collectors.joining("-"));
    }
}