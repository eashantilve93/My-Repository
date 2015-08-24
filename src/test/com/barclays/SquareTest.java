package com.barclays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Eashan on 8/24/2015.
 */
public class SquareTest {

    @Test
    public void shouldCalculatePerimeter()
    {
        Rectangle rectangle= new Rectangle(2);
        assertEquals(8.0,rectangle.perimeter(),0);
    }

    @Test
    public void shouldCalculateArea()
    {
        Rectangle rectangle= new Rectangle(3);
        assertEquals(9,rectangle.area(),0);
    }
}