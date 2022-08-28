package com.frederikzwartbol.kata.kyu7.highandlow;


import static java.util.Arrays.stream;

public class Kata {

    public static String highAndLow(String numbers) {
        var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return stats.getMax() + " " + stats.getMin();
    }
}
