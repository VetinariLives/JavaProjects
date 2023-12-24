package com.CSC1302;
//Name: Talha Ansari
//This program will print out a christmas tree with a specified height and number of segments
public class ChrisTree {
    public static void main(String[] args) {
        tree(6, 10);
    }

    public static void tree(int number, int height) {
        //the amount of times this loop runs determines the number of segments
        for (int l = 0; l < number; l++) {
            //the amount of times this loop runs determines the height of each segment
            for (int i = 0; i < height; i++) {
                //the amount of times this loop runs determines the number of spaces in each line. The formula is: # of spaces = height + number - 1 - i - l
                for (int j = 0; j < height + number - i - l; j++)
                    System.out.print(" ");
                //the amount of times this loop runs determines the number of stars in each line. The formula is: # of stars = 2i + 2l + 1
                for (int k = 0; k < 2 * i + 1 + 2 * l; k++)
                    System.out.print("*");
                System.out.println();
            }
        }
        //this for-loop prints the 2 stars that form the stem of the tree
        for (int i = 0; i < 2; i++) {
            //this for-loop ensures that the tree stem is spaced correctly
            for (int j = 0; j < height + number; j++)
                System.out.print(" ");
            System.out.println("*");
        }
        //this for-loop ensures that the 7-star long base of the tree is correctly spaced
        for (int i = 0; i < height + number - 3; i++)
            System.out.print(" ");
        System.out.println("*******");
    }
}
