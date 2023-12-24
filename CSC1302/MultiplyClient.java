package com.CSC1302;
//Name: Talha Ansari
public class MultiplyClient {
//this program initializes an array of fractions of length 7.
//it assigns each fraction a random numerator and denominator between 1 and 10
//it uses the multiply method to multiply the adjacent fractions with each other and prints out the results
    public static void main(String[] args) {
        //declares an array of Fraction objects of length 7
	    Fraction[] fractionArray = new Fraction[4 + 3];
	    //the for loop runs equivalent to the array length
        for (int i = 0; i < fractionArray.length; i++)
            //uses the Math.random method to assign each array element a numerator and demoniator from 1 to 10
            fractionArray[i] = new Fraction((int)(Math.random() * 10) + 1,(int)(Math.random() * 10) + 1);
        //the loop runs 1 less time than the array length
        for (int i = 0; i < fractionArray.length - 1; i++) {
            //uses the toString and multiply methods to print out the two component fractions and their product
            System.out.println(fractionArray[i].toString() + " * "  + fractionArray[i + 1].toString() + " = "
                    + multiply(fractionArray[i], fractionArray[i + 1]).toString());
        }

    }
    //public static method 'multiply' accepts 2 Fractions as arguments and returns a Fraction
    public static Fraction multiply(Fraction f, Fraction e) {
        // constructs the product Fraction 'm' to be equal to 0/0
        Fraction m = new Fraction(0,0);
        //sets m's numerator to be the product of the numerators of the argument Fractions
        m.setNumerator(e.getNumerator() * f.getNumerator());
        //sets m's denominator to be the product of the denominators of the argument Fractions
        m.setDenominator(e.getDenominator() * f.getDenominator());
        //returns the Fraction m wherever this method is called
        return m;
    }
}
