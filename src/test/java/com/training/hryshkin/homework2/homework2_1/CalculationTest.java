package com.training.hryshkin.homework2.homework2_1;

import org.junit.Assert;
import org.junit.Test;

public class CalculationTest {
    private IncomingData incomingData;
    private Calculation calculation;
    private double expected;
    private double actual;

    @Test
    public void testCalculateEasy() {
        incomingData = new IncomingData(new String[]{"2", "3", "1.1", "0.5"});
        calculation = new Calculation(incomingData);
        expected = calculation.calculate();
        actual = 21.9324542246;
        Assert.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void testCalculateNormal() {
        incomingData = new IncomingData(new String[]{"16", "37", "0.67", "68.553"});
        calculation = new Calculation(incomingData);
        expected = calculation.calculate();
        actual = 1.70634097448;
        Assert.assertEquals(expected, actual, 0.000001);
    }
}
