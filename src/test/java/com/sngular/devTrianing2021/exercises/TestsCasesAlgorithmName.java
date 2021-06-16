package com.sngular.devTrining2021.exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestsCasesAlgorithmName {
    @Test
    public void test() {
        assertEquals("Test value 125485923",985543221, AlgorithmName.orderNumber(125485923));
        assertEquals("Test value 346789925",998765432, AlgorithmName.orderNumber(346789925));
        assertEquals("Test value 29384756",98765432, AlgorithmName.orderNumber(29384756));
        assertEquals("Test value 514978236",987654321, AlgorithmName.orderNumber(514978236));
    }
}