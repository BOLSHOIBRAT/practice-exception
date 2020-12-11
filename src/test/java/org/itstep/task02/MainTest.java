package org.itstep.task02;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test (expected = NegativeNumberException.class)
    public void getPositiveLessHundredNumberNegativeNumberException() throws NegativeNumberException, GreatHundredException {
        Main.getPositiveLessHundredNumber(-10);
    }

    @Test (expected = GreatHundredException.class )
    public void getPositiveLessHundredNumberGreatHundredException() throws NegativeNumberException, GreatHundredException {
        Main.getPositiveLessHundredNumber(101);
    }
}