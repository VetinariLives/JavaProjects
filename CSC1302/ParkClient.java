package com.CSC1302;
//Name: Talha Ansari
public class ParkClient {
//this program creates an array of 5 park objects, constructs each with unique characteristics,
//finds the park with the largest size, and prints out its information
    public static void main(String[] args) {
        //declares a Park array of length 5
        Park[] arr = new Park[5];
        //constructs the first arr element with the given parameters
        arr[0] = new Park("CSC1302", "circle", 56, 5);
        //constructs the second arr element with the given parameters
        arr[1] = new Park("CSC1302", "square", 57, 6);
        //this for loop runs 3 times
        for (int i = 2; i < arr.length; i++){
            //the if statement runs if the random number is greater than 0.5
            if (Math.random() > 0.5)
                //constructs a park with a random name, a square shape, a random id, and a random length
                arr[i] = new Park("Park" + (int)(Math.random() * 20), "square", (int)(Math.random() * 11), Math.random()* 10);
            else
                //constructs a park with a random name, a circle shape, a random id, and a random length
                arr[i] = new Park("Park" + (int)(Math.random() * 20), "circle", (int)(Math.random() * 11), Math.random()* 10);

        }
        //sets the largest park equal to the first array element
        Park largest = arr[0];
        //for each loop runs 5 times
        for (Park i : arr) {
            //if statement runs if the area of park i is larger than the largest park
            if (i.parkSize() > largest.parkSize())
                //sets the largest park equal to park i
                largest = i;
        }
        //the following 2 statements print out the largest park info
        System.out.println("The largest park is named " + largest.getParkName() +
                " and has the iD " + largest.getParkID() + ".");
        System.out.println("It is in the shape of a " + largest.ParkShape + ", " +
                "and has an area of " + largest.parkSize() + " square meters");
    }
}
