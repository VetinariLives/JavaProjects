package com.CSC1302;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 16
public class Cat extends Animal{
//This program creates a class of Cat objects, which is a subclass of Animals
    //declares the private instance field color
    private String color;
    //default constructor for the cat object, accepts parameters: veg, food, and color
    public Cat(boolean veg, String food, String color) {
        //constructor for the superclass which uses the veg and food arguments of the Cat constructor as parameters.
        //the legs argument is set to 4 by default
        super(veg, food, 4);
        //sets the color instance field equal to the color argument
        this.color = color;
    }
    //constructor for the cat object, accepts parameters: veg, food, legs, and color
    public Cat(boolean veg, String food, int legs ,String color) {
        //constructor for the superclass which uses the veg, food, and legs arguments of the Cat constructor as parameters.
        super(veg, food, legs);
        //sets the color instance field equal to the color argument
        this.color = color;
    }
    //getter for 'color' instance field
    public String getColor() {
        return color;
    }
    //setter for 'color' instance field
    public void setColor(String color) {
        this.color = color;
    }
}
