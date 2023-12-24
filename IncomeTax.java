package com.CSC1302;
import java.util.*;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: June 22
public class IncomeTax {
//this program asks the user to enter the taxable income for a randomly generated number of individuals,
//calculates and displays the taxes owed per person, and displays the person who owes the highest amount
    public static void main(String[] args) {
	    Scanner console = new Scanner(System.in);
	    double[] incomeArray = new double[(int) (1 + (Math.random() * 15))];
	    double[] taxArray = new double[incomeArray.length];
        System.out.println("You will need to enter the taxable income for " +incomeArray.length+ " people");
        for (int i = 0; i < incomeArray.length; i++) {
            System.out.print("\nEnter the taxable income for person " + (i + 1) + " here: ");
            incomeArray[i] = console.nextDouble();
            if (incomeArray[i] < 750) {
                taxArray[i] = 0.01 * incomeArray[i];
                System.out.println("\nPerson " + (i + 1) + " owes $" + taxArray[i] + " in taxes.");
            }
            else if (incomeArray[i] < 2500.01) {
                taxArray[i] = 7.5 + 0.02 * (incomeArray[i] - 750);
                System.out.println("\nPerson " + (i + 1) + " owes $" + taxArray[i] + " in taxes.");
            }
            else if (incomeArray[i] < 5000.01) {
                taxArray[i] = 82.5 + 0.04 * (incomeArray[i] - 2500);
                System.out.println("\nPerson " + (i + 1) + " owes $" + taxArray[i] + " in taxes.");
            }
            else if (incomeArray[i] < 8000.01) {
                taxArray[i] = 142.5 + 0.05 * (incomeArray[i] - 5000);
                System.out.println("\nPerson " + (i + 1) + " owes $" + taxArray[i] + " in taxes.");
            }
            else {
                taxArray[i] = 230 + 0.06 * (incomeArray[i] - 8000);
                System.out.println("\nPerson " + (i + 1) + " owes $" + taxArray[i] + " in taxes.");
            }
        }
        double max = taxArray[0];
        int person = 0;
        for (int i = 1; i < taxArray.length; i++) {
            if (taxArray[i] > max) {
                max = taxArray[i];
                person = i;
            }
        }
        System.out.println("The individual owing the most in taxes is person " + person + ", who owes the government $" + max);
    }
}
