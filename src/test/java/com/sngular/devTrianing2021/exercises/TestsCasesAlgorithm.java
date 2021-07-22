package com.sngular.devTrining2021.exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestsCasesAlgorithm {
    @Test
    public void testOne() {
        assertEquals("Test value \"ozymandias\"","oz", Algorithm.startOz("ozymandias"));
    }

    @Test
    public void testTwo() {
        assertEquals("Test value \"bzoo\"","o", Algorithm.startOz("bzoo"));
    }

    @Test
    public void testThree() {
        assertEquals("Test value \"oxx\"","o", Algorithm.startOz("oxx"));
    }

    @Test
    public void testFour() {
        assertEquals("Test value \"oz\"","oz", Algorithm.startOz("oz"));
    }

    @Test
    public void testFive() {
        assertEquals("Test value \"ounce\"","o", Algorithm.startOz("ounce"));
    }

    @Test
    public void testSeven() {
        assertEquals("Test value \"abc\"","", Algorithm.startOz("abc"));
    }

    @Test
    public void testEigth() {
        assertEquals("Test value \"\"","", Algorithm.startOz(""));
    }

    @Test
    public void testNine() {
        assertEquals("Test value \"zoo\"","o", Algorithm.startOz("zoo"));
    }

    @Test
    public void testTen() {
        assertEquals("Test value \"aztec\"","z", Algorithm.startOz("aztec"));
    }

    @Test
    public void testEleven() {
        assertEquals("Test value \"zzzz\"","zz", Algorithm.startOz("zzzz"));
    }

    @Test
    public void testTwelve() {
        assertEquals("Test value \"oznic\"","oz", Algorithm.startOz("oznic"));
    }

    @Test
    public void testThirteen() {
        assertEquals("Test value \"ymaozndias\"","oz", Algorithm.startOz("ymaozndias"));
    }

    @Test
    public void testFourteen() {
        assertEquals("Test value \"ymandiasoz\"","oz", Algorithm.startOz("ymandiasoz"));
    }

    @Test
    public void testFiveteen() {
        assertEquals("Test value \"ymandiaso\"","o", Algorithm.startOz("ymandiaso"));
    }

    @Test
    public void testSixteen() {
        assertEquals("Test value \"ymandiasz\"","z", Algorithm.startOz("ymandiasz"));
    }
}