package com.frederikzwartbol.kata.kyu7.theoffice;


import java.util.stream.Stream;

public class TheOffice {
    record Person(String name, int happiness){}

    public static String outed(Person[] meet, String boss) {
        return Stream.of(meet).map(person
                        -> person.name.equals(boss) ? person.happiness * 2 : person.happiness)
                        .mapToInt(Integer::valueOf).sum()/ (double) meet.length <= 5 ? "Get Out Now!" : "Nice Work Champ!";
    }
}
