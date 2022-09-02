package com.frederikzwartbol.kata.kyu7.square;

public class Square {
    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }
}

