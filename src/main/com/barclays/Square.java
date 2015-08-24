package com.barclays;

/**
 * Created by Eashan on 8/24/2015.
 */
public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double perimeter()
    {
        return ((this.side)*4);
    }
    public double area()
    {
        return (this.side*this.side);
    }
}
