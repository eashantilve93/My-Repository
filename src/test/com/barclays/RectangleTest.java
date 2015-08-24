package com.barclays;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Eashan on 8/24/2015.
 */
public class RectangleTest {

    @Test
    public void shouldCalculatePerimeter()
    {
        Rectangle rectangle= new Rectangle(3,2);
        assertEquals(10.0,rectangle.perimeter(),0);
    }

    @Test
    public void shouldCalculateArea()
    {
        Rectangle rectangle= new Rectangle(3,2);
        assertEquals(6.0,rectangle.area(),0);
    }
}