package com.frederikzwartbol.kata.kyu7.descendingorder;

import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {

    public static int sortDesc(final int num) {
      return Integer.valueOf(String.valueOf(num).chars()
              .mapToObj(c -> (char) c).toList()
              .stream().sorted(Comparator.reverseOrder()).
              map(String::valueOf).collect(Collectors.joining()));
    }
}