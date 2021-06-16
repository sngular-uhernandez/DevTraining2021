package com.sngular.devTrining2021.exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestsCasesAlgorithmName {
    @Test
    public void testOne() {
        assertEquals("Test value 125485923",985543221, AlgorithmName.orderNumber(125485923));
    }
    @Test
    public void testTwo() {
        assertEquals("Test value 346789925",998765432, AlgorithmName.orderNumber(346789925));
    }
    @Test
    public void testThree() {
        assertEquals("Test value 29384756",98765432, AlgorithmName.orderNumber(29384756));
    }
    @Test
    public void testFour() {
        assertEquals("Test value 514978236",987654321, AlgorithmName.orderNumber(514978236));
    }
}