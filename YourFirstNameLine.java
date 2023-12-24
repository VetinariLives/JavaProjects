package com.CSC1302;
import java.awt.*;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 13
public class YourFirstNameLine { /*
This program creates a class of YourFirstNameLine objects
The class has 6 private instance fields:
    a start Point
    an end Point
    x-coordinate 1
    x-coordinate 2
    y-coordinate 1
    y-coordinate 2
It also has 6 instance methods:
    a constructor, which accepts 2 Point objects as parameters
    a start Point getter
    an end Point getter
    toString method, which prints out the line's start and end coordinates
    getSlope method, which returns the slope of the line as a double
    draw method, which uses the DrawingPanel class to draw the line

*/  private Point start;
    private Point end;
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public YourFirstNameLine(Point p1, Point p2) {
        start = p1;
        end = p2;
        x1 = p1.getX();
        y1 = p1.getY();
        x2 = p2.getX();
        y2 = p2.getY();
    }

    public Point getStartPoint() {
        return start;
    }

    public Point getEndPoint() {
        return end;
    }
    @Override
    public String toString(){
        return "[(" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ")]";
    }
    public double getSlope() {
        if(x1 == x2) return 0;
        else return ((double)(y2 - y1))/(x2 - x1);
    }
    public void draw(Graphics g) {
        DrawingPanel panel = new DrawingPanel(600, 400);
        g = panel.getGraphics();
        g.setColor(Color.RED);
        g.drawLine(x1, y1, x2, y2);
    }

}
