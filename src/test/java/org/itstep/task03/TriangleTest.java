package org.itstep.task03;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test (expected = CreateTriangleException.class)
    public void shouldThrowSide1AndSide2LessThanSide3() throws CreateTriangleException {
        Triangle triangle = new Triangle(1,1,3);
    }
    @Test (expected = CreateTriangleException.class)
    public void shouldThrowSide2AndSide3LessThanSide1() throws CreateTriangleException {
        Triangle triangle = new Triangle(3,1,1);
    }
    @Test (expected = CreateTriangleException.class)
    public void shouldThrowSide3AndSide1LessThanSide2() throws CreateTriangleException {
        Triangle triangle = new Triangle(1,3,1);
    }
}