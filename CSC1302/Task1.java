package com.CSC1302;
//Name: Talha Ansari
public class Task1 {
    //this program will print out the pattern specified within the lab instructions
    //this will be carried out in the main method
    public static void main(String[] args) {
	    //the outer for loop determines the number of lines that will be printed
        //it increments backwards from 5, since the first letter in each line will be equal to i
        // it will run 5 times
        for (int i = 5; i > 0; i--) {
            //the if else statements separate lines greater than 2, which begin 2 lines down from each other,
            //from lines less than or equal to 2, which start only 1 line down
            if (i > 2) {
                //the inner loop determines the number of digits printed out
                //it runs 5 - line# times
                for (int j = 0; j <= 5 - i; j++)
                    //this statement prints out the digits in each line, starting from the line number till 5
                    System.out.print(j + i);
                //this statement causes the next print statement to begin 2 lines down
                System.out.println("\n");
            }
            //see lines 12 - 13
            else {
                //the inner loop determines the number of digits printed out
                //it runs 5 - line# times
                for (int j = 0; j <= 5 - i; j++)
                    //this statement prints out the digits in each line, starting from the line number till 5
                    System.out.print(j + i);
                //this statement causes the next print statement to begin 1 line down
                System.out.println();
            }
        }
    }
}
