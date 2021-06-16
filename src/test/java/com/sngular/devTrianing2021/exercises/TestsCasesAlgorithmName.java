package com.sngular.devTrining2021.test.exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestsCasesAlgorithmName {
    @Test
    public void test() {
        assertEquals("Test value Dermatoglyphics",true, AlgorithmName.isIsogram("Dermatoglyphics"));
        assertEquals("Test value isogram",true, AlgorithmName.isIsogram("isogram"));
        assertEquals("Test value moose",false, AlgorithmName.isIsogram("moose"));
        assertEquals("Test value isIsogram",false, AlgorithmName.isIsogram("isIsogram"));
        assertEquals("Test value aba",false, AlgorithmName.isIsogram("aba"));
        assertEquals("Test value moOse",false, AlgorithmName.isIsogram("moOse"));
        assertEquals("Test value thumbscrewjapingly",true, AlgorithmName.isIsogram("thumbscrewjapingly"));
        assertEquals("Test value ''",true, AlgorithmName.isIsogram(""));
    }
}