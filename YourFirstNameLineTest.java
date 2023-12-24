package com.CSC1302;
import java.awt.Graphics;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 13
public class YourFirstNameLineTest {
//This program constructs two Point objects, and then constructs a
//YourFirstNameLine object using the Points. It then uses the draw class to draw the line.

	public static Graphics g;

	public static void main(String[] args) {
	Point p1 = new Point(7,7);
	Point p2 = new Point(5,4);
	YourFirstNameLine line = new YourFirstNameLine(p1, p2);
	line.draw(g);
    }
}
