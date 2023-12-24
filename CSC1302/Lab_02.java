package com.CSC1302;
//Name: Talha Ansari
public class Lab_02 {
    //method that draws first and last side
    public static void LFside(int n) {
        //for loop will print out the number of x's needed to form the border
        for (int i = 0; i < n; i++) {
            System.out.print('x');
        }
        //this line ensures that any subsequent text appears on the next line
        System.out.println("");
    }
    //method that draws middle side
    public static void Mside(int n) {
        System.out.print('x');
        // the i > n - 2 ensures that number of a's is 2 less than the length
        for (int i = 0; i < n - 2; i++){
            System.out.print('a');
        }
        System.out.println('x');
    }
    //method that calculates area of square
    public static void Area(int n) {
        System.out.println("The area of this square is: " + (n * n));
    }

    public static void main (String[] args) {
        //initializes n, which is last digit of ID + 5. This determines the length of the square
        int n = 4 + 5;
        //draw first side
        LFside(n);
        //draw the middle
        for (int i = 0; i < n - 2; i++) {
            Mside(n);
        }
        //draw last side
        LFside(n);
        //find and print area of the square
        Area(n);
    }
}
