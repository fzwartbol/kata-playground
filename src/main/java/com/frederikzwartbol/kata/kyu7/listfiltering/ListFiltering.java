package com.frederikzwartbol.kata.kyu7.listfiltering;

import java.util.List;
import java.util.stream.Collectors;

/**
 * In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
 */
public class ListFiltering {

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        return list.stream().filter(i -> i instanceof Integer).collect(Collectors.toList());
    }
}
