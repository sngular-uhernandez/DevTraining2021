package com.sngular.devTrining2021.exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestsCasesAlgorithmName {
    @Test
    public void testOne() {
        assertEquals("Test value Dermatoglyphics",true, AlgorithmName.isIsogram("Dermatoglyphics"));
    }
    @Test
    public void testTwo() {
        assertEquals("Test value isogram",true, AlgorithmName.isIsogram("isogram"));
    }
    @Test
    public void testThree() {
        assertEquals("Test value moose",false, AlgorithmName.isIsogram("moose"));
    }
    @Test
    public void testFour() {
        assertEquals("Test value isIsogram",false, AlgorithmName.isIsogram("isIsogram"));
    }
    @Test
    public void testFive() {
        assertEquals("Test value aba",false, AlgorithmName.isIsogram("aba"));
    }
    @Test
    public void testSix() {
        assertEquals("Test value moOse",false, AlgorithmName.isIsogram("moOse"));
    }
    @Test
    public void testSeven() {;
        assertEquals("Test value thumbscrewjapingly",true, AlgorithmName.isIsogram("thumbscrewjapingly"));
    }
    @Test
    public void testEigt() {
        assertEquals("Test value ",true, AlgorithmName.isIsogram(""));
    }
}