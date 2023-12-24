package com.CSC1302;
//Name: Talha Ansari
public class Point {
//this program creates a class of Point objects
    //declares the Point's x-coordinate
    private int x;
    //declares the Point's y-coordinate
    private int y;
    //returns the Point's x-coordinate wherever this method is called
    public int getX() { return x; }
    //returns the Point's y-coordinate wherever this method is called
    public int getY() { return y; }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(){this(0,0);}

    //this constructor creates new Point object with the coordinates given in the parameters
    public Point(int x, int y) {
        //sets the Point's x equal to the one given in the parameters
        this.x = x;
        //sets the Point's x equal to the one given in the parameters
        this.y = y;
    }

    public boolean equals(Object o) {
        if (o instanceof Point){
            Point other = (Point) o;
            return this.x == other.x && this.y == other.y;
        }
        else return false;
    }

    @Override
    //returns a String containing a description of the Point's coordinates wherever this method is called
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    //calculates and returns the distance between the Point and the argument
    public double distance(Point other) {
        //finds the absolute value of the horizontal distance
        double xDistance = Math.abs(x - other.x);
        //finds the absolute value of the vertical distance
        double yDistance = Math.abs(y - other.y);
        //calculates the distance
        double distance = Math.sqrt(xDistance*xDistance + yDistance*yDistance);
        return distance;
    }
}
