package com.CSC1302;
import java.util.ArrayList;
//Name: Talha Ansari
public class Park {
//this program creates a class of Park objects
    //name public instance field
    public String ParkName;
    //shape public instance field
    public String ParkShape;
    //ID public instance field
    public int ParkID;
    //length private instance field
    private double ParkLength;
    //private instance field that holds all the IDs
    private ArrayList<Integer> IDlist = new ArrayList<Integer>();

    //constructor that makes new Park objects. accepts parameters
    public Park(String name, String shape, int iD, double length) {
        //sets ParkName equal to name parameter
        this.ParkName = name;
        //sets ParkShape equal to shape parameter
        this.ParkShape = shape;
        //sets ParkLength equal to length parameter
        this.ParkLength = length;
        //if statement runs when shape parameter is not equal to either square or circle
        if (!(shape.equalsIgnoreCase("circle") || shape.equalsIgnoreCase("square")))
            //throws an error message that states that shape must be either circle or square
            throw new IllegalArgumentException("Shape must be either circle or square");
        //initializes and declares boolean flag as true
        boolean flag = true;
        //for each loop runs equivalent to the size of the IDlist arraylist
        for (int i : IDlist) {
            //if statement runs when the IDlist entry is equivalent to the iD parameter
            if (IDlist.get(i) == iD)
                //sets flag to false
                flag = false;
            else
                //sets flag to true
                flag = true;
        }
        //if statement runs when flag is true
        if (flag) {
            //sets ParkID equivalent to iD parameter
            this.ParkID = iD;
            //adds iD parameter to IDlist
            IDlist.add(iD);
        }
        //else statement runs when flag is false
        else
            //throws an error message explaining that the entered ID is not unique
            throw new IllegalArgumentException("The ID entered is not unique. Please restart the program and try again");

    }
    //this method calculates the area of the park
    public double parkSize() {
        //sets double size equal to 0
        double size = 0;
        //if statement runs when the shape parameter is equal to square
        if (ParkShape.equalsIgnoreCase("square"))
            //sets size equal to ParkLength squared
            size = ParkLength * ParkLength;
        //if statement runs when the shape parameter is equal to circle
        if (ParkShape.equalsIgnoreCase("circle"))
            //sets size equal to pi*r^2
            size = Math.PI * (ParkLength / 2) * (ParkLength / 2);
        //returns double size wherever this method is called
        return size;
    }
    //getter for ParkName
    public String getParkName() {
        return ParkName;
    }
    //getter for ParkID
    public int getParkID() {
        return ParkID;
    }
    //getter for ParkLength
    public double getParkLength() {
        return ParkLength;
    }
}
