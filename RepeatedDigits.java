package com.CSC1302;
import java.util.*;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: June 22
public class RepeatedDigits {
//this program receives a user inputted integer, and returns a table that displays
//the number of time each digit appears in the number
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int check;
        do {
            System.out.println("Enter an integer on the next line. Enter a number less than or equal to 0 to stop.");
            check = console.nextInt();
            if (check <= 0)
                break;
            int number = check;
            int z = 0, o = 0, t = 0, th = 0, f = 0, fi = 0, s = 0, se = 0, e = 0, n = 0;
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                if (digit == 0)
                    z++;
                else if (digit == 1)
                    o++;
                else if (digit == 2)
                    t++;
                else if (digit == 3)
                    th++;
                else if (digit == 4)
                    f++;
                else if (digit == 5)
                    fi++;
                else if (digit == 6)
                    s++;
                else if (digit == 7)
                    se++;
                else if (digit == 8)
                    e++;
                else
                    n++;
            }
            System.out.println(" Digit:       0 1 2 3 4 5 6 7 8 9 ");
            System.out.println("Ocurrences:   " + z + " " + o + " " + t + " " + th + " " + f + " " + fi + " " + s + " " + se + " " + e + " " + n);
        } while (check > 0);
    }
}
