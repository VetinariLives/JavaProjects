package com.CSC1302;
import java.util.*;
//Name: Talha Ansari
/*This program, called Swap, will take an inputted series of either letters or numbers and
return a version in which each pair of characters has been swapped*/
public class Swap {

    public static void main(String[] args) {
        //initializes Scanner
        Scanner console = new Scanner(System.in);
        //calls swapDigitPairs method with PantherID argument
        swapDigitPairs(2587754);
        //asks user to input integer number
        System.out.print("\nPlease input a number to be swapped: ");
        //declares and initializes int n as equal to inputted integer
        int n = console.nextInt();
        System.out.print("\nThe swapped result is: ");
        //calls swapDigitPairs method with the inputted integer as the argument
        swapDigitPairs(n);
        //asks user to input integer number
        System.out.print("\nPlease input a string to be swapped: ");
        //declares and initializes string str as equal to inputted string
        String str = console.next();
        System.out.print("\nThe swapped result is: ");
        //calls swapLetterPairs method with the inputted String as the argument
        swapLetterPairs(str);

    }

    public static void swapDigitPairs (int n) {
        //initializes the arraylist
        ArrayList<Integer> list = new ArrayList<Integer>();
        //this loop uses the list.add method to take the user inputted integer, divide it by 10, and then adds the remainder to the list
        do{
            list.add(0, n % 10);
            n /= 10;
        } while  (n > 0);
        //initializes an int array that is the same size as the arraylist
        int[] array = new int[list.size()];
        //this loop copies the value of arraylist to the int array
        for (int i = 0; i < list.size(); i++)
            array[i] = list.get(i);
        //the if statement tests to see if the inputted integer has an even amount of digits
        if (array.length % 2 == 0) {
            //this loop switches the digit pairs. it will run for as many iterations as there are digit pairs
            for (int i = 0; i < array.length/2; i++){
                //initializes and declares int j, which is 2i.
                int j = i * 2;
                //initializes and declares int hold, which temporarily hold the value of the first digit in the digit pair.
                int hold = array[j];
                //the following 2 statements switch the values of the digit pairs
                array[j] = array[j + 1];
                array[j + 1] = hold;
            }
        }
        //the else statement runs only when the inputted integer has an odd amount of digits
        else {
            //this loop switches the digit pairs. it will run for as many iterations as there are digit pairs
            for (int i = 0; i < array.length/2; i++){
                //initializes and declares int j, which is 2i + 1. since the integer has an odd amount of digits, it ignores the leftmost digit, hence the + 1
                int j = 1 + i * 2;
                //initializes and declares int hold, which temporarily hold the value of the first digit in the digit pair.
                int hold = array[j];
                //the following 2 statements switch the values of the digit pairs
                array[j] = array[j + 1];
                array[j + 1] = hold;
            }
        }
        //this for loop prints out every digit within the swapped int array
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]);
    }
    private static void swapLetterPairs (String blah) {
        //converts the inputted string to a char array
        char[] c = blah.toCharArray();
        //the if statement tests to see if the inputted string has an even amount of characters
        if (c.length % 2 == 0) {
            //this loop switches the letter pairs. it will run for as many iterations as there are letter pairs
            for (int i = 0; i < c.length/2; i++){
                //initializes and declares int j, which is 2i
                int j = i * 2;
                //initializes and declares char hold, which temporarily hold the value of the first char in the letter pair.
                char hold = c[j];
                //the following 2 statements switch the chars of the letter pairs
                c[j] = c[j + 1];
                c[j + 1] = hold;
            }
        }
        //the else statement runs only when the inputted string has an odd amount of characters
        else {
            //this loop switches the letter pairs. it will run for as many iterations as there are letter pairs
            for (int i = 0; i < c.length/2; i++){
                //initializes and declares int j, which is 2i + 1. since the string has an odd amount of characters, it ignores the leftmost char, hence the + 1
                int j = 1 + i * 2;
                //initializes and declares char hold, which temporarily hold the value of the first char in the letter pair.
                char hold = c[j];
                //the following 2 statements switch the chars of the letter pairs
                c[j] = c[j + 1];
                c[j + 1] = hold;
            }
        }
        //this statement prints out the swapped char array
        System.out.println(c);
    }

}
