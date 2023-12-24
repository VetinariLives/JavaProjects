package com.CSC1302;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 16
public class Animal {
//this program creates a class ofAnimal objects
    //declares the private instance field vegetarian
    private boolean vegetarian;
    //declares the private instance field eats
    private String eats;
    //declares the private instance field numLegs
    private int numLegs;

    //class constructor, accepts parameters: veg, food, and legs
    public Animal(boolean veg, String food, int legs) {
        //sets the vegetarian instance field equal to the veg argument
        vegetarian = veg;
        //sets the eats instance field equal to the food argument
        eats = food;
        //sets the numLegs instance field equal to the legs argument
        numLegs = legs;
    }
    //getter for 'vegetarian' instance field
    public boolean isVegetarian() {
        return vegetarian;
    }
    //setter for 'vegetarian' instance field
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    //getter for 'eats' instance field
    public String getEats() {
        return eats;
    }
    //setter for 'eats' instance field
    public void setEats(String eats) {
        this.eats = eats;
    }
    //getter for 'numLegs' instance field
    public int getNumLegs() {
        return numLegs;
    }
    //setter for 'numLegs' instance field
    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }
}
