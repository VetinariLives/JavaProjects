package com.CSC1302;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 21
public class Main {
//This Program constructs 1 Doctor object and 1 Student object and prints them out
    public static void main(String[] args) {
    //constructs student alex using the arguments given in the instructions
	Student alex = new Student(18, 150, 170,"CS", 3.4,54);
	//constructs doctor jack using the arguments given in the instructions
	Doctor jack = new Doctor(40, 179, 173, 4, "Dermatology");
	//prints out alex and jack
	System.out.println(alex + "\n" + jack);
    }
}
