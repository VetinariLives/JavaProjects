package com.CSC1302;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 14
public class Fraction {
//This program creates a class of Fraction Objects
    //instance field which is the Fraction's numerator
    private int numerator;
    //instance field which is the Fraction's denominator
    private int denominator;

    //this method is the objects constructor. It accepts 2 ints as its arguments
    public Fraction(int numerator, int denominator) {
        //sets the Fractions numerator equal to the numerator argument
        this.numerator = numerator;
        //sets the Fractions denominator equal to the denominator argument
        this.denominator = denominator;
    }

    @Override
    //toString method returns the Fraction in String form
    public String toString() {
        //returns numerator/denominator wherever the method is called
        return numerator + "/" + denominator;
    }
    //getter for the numerator
    public int getNumerator() {
        return numerator;
    }
    //setter for the numerator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    //getter for the denominator
    public int getDenominator() {
        return denominator;
    }
    //setter for the denominator
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
