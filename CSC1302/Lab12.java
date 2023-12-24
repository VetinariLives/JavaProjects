package com.CSC1302;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 16
public class Lab12 {
    public static void main(String[] args) {
        //constructs new Cat object with given parameters
        Cat feline = new Cat(false, "meat", "white");
        //prints out whether or not the object is vegetarian
        System.out.println("Cat is vegetarian: " + feline.isVegetarian());
        //prints out the eats attribute of the object
        System.out.println("Cat eats " + feline.getEats());
        //prints out the numLegs attribute of the object
        System.out.println("Cat has " + feline.getNumLegs() + " legs.");
        //prints out the color attribute of the object
        System.out.println("Cat is colored " + feline.getColor());
    }
}
