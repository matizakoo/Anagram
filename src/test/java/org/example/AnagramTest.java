package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @Test
    @DisplayName("Incorrect data: gahs, vdss")
    public void incorrect1(){
        assertFalse(Anagram.isAnagram("gahs", "vdss"));
    }

    @Test
    @DisplayName("Incorrect data: gaswesa, jtdfjtrjf")
    public void incorrect2(){
        assertFalse(Anagram.isAnagram("gaswesa", "jtdfjtrjf"));
    }

    @Test
    @DisplayName("Correct data: gfdsa, asdfg")
    public void correct1(){
        assertTrue(Anagram.isAnagram("gfdsa", "asdfg"));
    }

    @Test
    @DisplayName("Correct data: polska43, 43olpksa")
    public void correct2(){
        assertTrue(Anagram.isAnagram("polska43", "43olpksa"));
    }
}