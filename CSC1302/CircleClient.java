package com.CSC1302;
//Name: Talha Ansari
public class CircleClient {
//this program creates a Circle object, prints it out using the DrawingPanel class,
//prints its area and circumference, and determines whether a given point lies within the circle
    public static void main(String[] args) {
        Point center = new Point(10, 5);
        Circle c = new Circle(center, 7);
        System.out.println("Area = " + c.getArea() + "\nCircumference = " + c.getCircumference());
        Point test = new Point(5,7);
        if (c.liesInside(test))
            System.out.println("(5,7) lies within the circle");
        else
            System.out.println("(5,7) does not lie within the circle");
    }
}
