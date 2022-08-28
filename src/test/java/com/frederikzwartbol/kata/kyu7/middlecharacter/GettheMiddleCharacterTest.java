package com.frederikzwartbol.kata.kyu7.middlecharacter;

import com.frederikzwartbol.kata.kyu7.highandlow.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GettheMiddleCharacterTest {
    @Test
    public void evenTests() {
        assertEquals("es", GettheMiddleCharacter.getMiddle("test"));
        assertEquals("dd", GettheMiddleCharacter.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t",GettheMiddleCharacter.getMiddle("testing"));
        assertEquals("A", GettheMiddleCharacter.getMiddle("A"));
    }

}