package com.CSC1302;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 20
public class Ticket {/*
    This program creates a class of Ticket objects
    The class has 2 instance variables:
    double price: holds the price of each ticket
    private int number: holds each ticket's assigned number
    The class has 3 instance methods:
    a constructor, which accepts a int as a parameter and sets number equal to it
    a getter for price
    a toString method
    Below that is a main method that creates and prints a StudentAdvanceTicketObject to demonstrate that the program runs

  */double price;
    private int number;

    public Ticket(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Number: " + number + ", Price: " + price ;
    }
    public static void main(String[] args) {
        StudentAdvanceTicket t = new StudentAdvanceTicket(4, 11);
        System.out.println(t);
    }
}
