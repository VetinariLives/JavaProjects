package com.CSC1302;
import java.util.Scanner;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 06
public class FractionScale {
//this program is a client of Fraction.java, and asks the user to create a new Fraction,
//choose whether to scale it up or down, and what factor to scale it by.
//it then prints out the final fraction
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("This program performs scaling operations on a fraction.\nEnter a fraction: ");
        String frac = console.nextLine();
        String[] nums = frac.split("/");
        int num = Integer.parseInt(nums[0]);
        int denom = Integer.parseInt(nums[1]);;
        Fraction fraction = new Fraction(num, denom);
        System.out.print("\nScale up or down (1: up, 0: down): ");
        int upDown = console.nextInt();
        System.out.print("\nEnter a scale factor: ");
        int factor = console.nextInt();
        if (upDown == 0) {
            fraction.scale(factor, false);
            System.out.println("Scaled fraction is: " + fraction.getNumerator() + "/" + fraction.getDenominator());
        }
        else if (upDown == 1){
            fraction.scale(factor, true);
            System.out.println("Scaled fraction is: " + fraction.getNumerator() + "/" + fraction.getDenominator());
        }
        else
            System.out.println("You have made an error. Please restart the program and try again.");
    }
}
