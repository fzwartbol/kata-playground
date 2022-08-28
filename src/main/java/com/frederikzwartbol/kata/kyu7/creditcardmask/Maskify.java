package com.frederikzwartbol.kata.kyu7.creditcardmask;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Maskify {
    public static String maskify(String str) {
       return IntStream.range(0,str.length()).mapToObj(i -> i < str.length()-4 ?  "#"  : str.substring(i, i+1)).collect(Collectors.joining(""));
    }
}

