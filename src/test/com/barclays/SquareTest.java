package com.barclays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Eashan on 8/24/2015.
 */
public class SquareTest {

    @Test
    public void shouldCalculatePerimeter() {
        Square square = new Square(5);
        assertEquals(20.0,square.perimeter(),0);
    }

    @Test
    public void shouldCalculateArea() {
        Square square = new Square(5);
        assertEquals(25.0,square.area(),0);
    }
}