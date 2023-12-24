package com.CSC1302;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 21
public class Human implements Mammal {
//this program creates a class of Human objects. It implements the interface Mammal.java
    //declares private instance field 'age', which holds the human's age in years
    private int age;
    //declares private instance field 'weight', which holds the human's weight in pounds
    private double weight;
    //declares private instance field 'height', which holds the human's height in centimeters
    private double height;

    //constructor for Human, accepts the following parameters
    public Human(int age, double weight, double height) {
        //sets the 'age' instance field equal to the 'age' parameter
        this.age = age;
        //sets the 'weight' instance field equal to the 'weight' parameter
        this.weight = weight;
        //sets the 'height' instance field equal to the 'height' parameter
        this.height = height;
    }
    //getter for age
    public int getAge() {
        return age;
    }
    //getter for weight
    public double getWeight() {
        return weight;
    }
    //getter for height
    public double getHeight() {
        return height;
    }

    @Override
    //inherited method from Mammal.java, but we don't use it so it's just vibing
    public double hairColor() {
        return 0;
    }
}
