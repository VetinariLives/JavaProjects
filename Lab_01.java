package com.CSC1302;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: June 11
public class Lab_01 {
    //Method for calculating the sum of arithmetic Sequence
    //number = the desired starting point of the sequence
    //n = the desired number of times you wish it to run
    public static int Arithmetic_sequence(int n, int number) {
        //total = sum of sequence
        int total;
        //arithmetic sequence
        total = (n/2) * ((2*number) + (n - 1) * 2);
        //the method will return the value of the sequence using the given parameters
        return total;
    }

    public static void main(String[] args) {
        //2*(last-two digits of PantherID + 5) = 2 * (54 + 5) = 2 * 59 = 118
        int n = 118;
        //temporary value to store sum
        int sum = n;
        //value that holds the final sum
        int total = 0;
        //for loop to calculate the sum
        for (int i = 0; i <30; i++) {
            total += sum;
            sum = sum + 2;
        }
        //prints the results of the loop
        System.out.println("The result of the for loop is " + total);
        //prints the results of the method
        System.out.println("The result of the method is " + Arithmetic_sequence(30, n));
    }
}