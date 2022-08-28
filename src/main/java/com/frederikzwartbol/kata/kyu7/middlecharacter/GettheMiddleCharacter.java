package com.frederikzwartbol.kata.kyu7.middlecharacter;

import java.util.List;

public class GettheMiddleCharacter {
    public static String getMiddle(String word) {
        List<Character> chars = word.chars().mapToObj(c -> (char)c).toList();
        return word.length() % 2 == 0 ?
                chars.get((chars.size()/2)-1).toString()+chars.get(chars.size()/2).toString() :
                chars.get((chars.size()/2)).toString();
    }

}
