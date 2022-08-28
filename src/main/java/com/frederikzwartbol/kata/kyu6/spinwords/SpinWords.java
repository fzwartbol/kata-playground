package com.frederikzwartbol.kata.kyu6.spinwords;


import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" ")).toList().stream().map(i -> i.length() >= 5 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining(" "));
        }
    }
