package com.CSC1302;
//Name: Talha Ansari
public class ColoredPointClient {
//this program constructs 2 ColoredPoint objects, compares them, and prints them out
    public static void main(String[] args) {
        ColoredPoint c = new ColoredPoint(9, 20, "GREEN");
        ColoredPoint g = new ColoredPoint(19, 29, "GREEN");
        System.out.println(c.equals(g));
        System.out.println(c);
        System.out.println(g);
    }

}
