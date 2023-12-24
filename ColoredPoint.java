package com.CSC1302;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 20
public class ColoredPoint extends Point implements Colored {/*
    This program creates a class of ColoredPoint objects, and is a subclass of Point.java
    The class has 1 instance variables: private String color, which holds the color of each point
    The class has 7 instance methods:
    constructor 1, which calls the default parent constructor and sets the color equal to black
    constructor 2, which accepts 2 ints as parameters and uses them as the arguments in the parent constructor. it then sets the color to black
    constructor 3, which accepts 1 String as a parameter and calls the default parent constructor. it sets color equal to the parameter
    constructor 4, which accepts 2 ints as parameters and uses them as the arguments in the parent constructor. it then sets color equal to the 3rd parameter
    a getter and setter for color
    a toString method, which overrides the one in the parent class
   */private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public ColoredPoint() {
        super();
        color = "BLACK";
    }
    public ColoredPoint(int x, int y) {
        super(x,y);
        color = "BLACK";
    }

    public ColoredPoint(String color) {
        super();
        this.color = color;
    }

    public ColoredPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + " " + color;
    }

}
