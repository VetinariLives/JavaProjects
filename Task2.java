package com.CSC1302;
//imports
import java.util.*;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: June 16
public class Task2 {
    public static void main (String[] args) {
        //declares and initializes Scanner
        Scanner console = new Scanner(System.in);
        //asks user to input numbers
        System.out.println("Enter the numbers you wish to average, using the return key to separate each number." +
                "\nEnter a negative number to exit.");
        //declares and initializes variable num, which holds the value of the inputted number
        double num = console.nextDouble();
        //declares and initializes variable sum, which holds the value of the sum of all the inputted positive numbers
        double sum = 0;
        //declares and initializes double count, which holds the value of the number of positive numbers entered
        double count = 0;
        //the while loop runs until a negative number is inputted
        while (num >= 0) {
            //here we set sum to be equal to sum + num.
            sum += num;
            //here we set num to be equal to the next inputted number
            //this statement is after the sum concatenation bc if it was, the sequence would cause the
            //negative number to be added to sum before the loop could break
            num = console.nextDouble();
            //increments count by 1, which keeps track of how many times the loop runs.
            //this is equivalent to the number of times a positive number was entered
            count++;
        }
        //initializes and declares variable mean, which is sum/count
        double mean = sum/count;
        //prints the average of the inputted positive numbers
        System.out.println("The average of the inputted positive numbers is: " + mean);
    }
}
