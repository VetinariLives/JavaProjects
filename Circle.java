package com.CSC1302;
import java.awt.*;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 2
public class Circle {
//this program creates a class of Circle objects
    //initializes a DrawingPanel object to print out the circle object with
    DrawingPanel panel = new DrawingPanel(100, 100);
    //see line 8
    Graphics g = panel.getGraphics();
    //declares the private field radius that determines the circle object's radius
    private int radius;
    //declares the point object that serves as the circle object's center
    private Point p;

    //this constructor creates and prints a new circle object centered at point p with radius radius
    public Circle(Point p, int radius) {
        //sets the object's radius equal to the argument
        this.radius = radius;
        //sets the object's point equal to the argument
        this.p = p;
        //sets the circle's color to black
        g.setColor(Color.BLACK);
        //draws the circle. The drawOval method uses the argument coordinates as the top left corner of the object,
        //so I adjusted the circle's center coordinates
        g.drawOval(p.getX() - radius, p.getY() - radius, radius*2, radius*2);
    }
    //returns the object's center point wherever this method is called
    public Point getCenter() {
        return p;
    }
    //returns the object's radius wherever this method is called
    public int getRadius() {
        return radius;
    }
    //returns the circle's area wherever this method is called, using the formula area = pi*r^2
    public double getArea() {
        return radius * radius * Math.PI;
    }
    //returns the circle's circumference wherever this method is called, using the formula circumference = pi*r*2
    public double getCircumference() {
        return radius * 2 * Math.PI;
    }
    //returns a string stating the object's center coordinates and radius wherever this object is called
    public String toString() {
        return "Circle [center = (" + p.getX() + ", " + p.getY() + "), radius = " + radius + "]";
    }
    //determines whether the point in the parameter is within the circle, and returns a boolean value accordingly
    public boolean liesInside(Point x) {
        //the if-statement uses the Point.distance method to check
        // if the distance between the two points is greater than the circle's radius
        if(p.distance(x) <= radius) return true;
        else return false;
    }
}
