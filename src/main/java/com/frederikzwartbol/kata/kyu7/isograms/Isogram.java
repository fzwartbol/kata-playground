package com.frederikzwartbol.kata.kyu7.isograms;

public class Isogram {
    public static boolean  isIsogram(String str) {
        return str.toLowerCase().chars().distinct().toArray().length == str.length();
    }
}
