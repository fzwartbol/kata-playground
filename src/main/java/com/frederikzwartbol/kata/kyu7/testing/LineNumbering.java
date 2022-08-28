package com.frederikzwartbol.kata.kyu7.testing;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        return IntStream.range(0, lines.size()).mapToObj(i ->  String.format("%d: %s",i+1,lines.get(i))).collect(Collectors.toList());
    }
}