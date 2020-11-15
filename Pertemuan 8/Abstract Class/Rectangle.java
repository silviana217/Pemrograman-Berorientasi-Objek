package com.pboreg;

public class Rectangle extends Shape{
    private int length,width;

    public double getArea() {
        return length*width;
    }

    public String toString(){
        return "Rectangle";
    }
}
