package com.CSC1302;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 20
public class StudentAdvanceTicket extends AdvanceTicket{/*
    This program creates a class of StudentAdvanceTicket objects, and is a subclass of AdvanceTicket.java
    The class has a constructor, which accepts 2 ints as a parameter
    It uses them as the argument in the parent constructor
    It then sets the price as half the price set by the parent constructor, as these tickets are half as expensive
    The class also has a toString method, which overrides the one from Ticket.java
  */public StudentAdvanceTicket(int number, int days) {
        super(number, days);
        price /= 2;
    }

    @Override
    public String toString() {
        return super.toString() + " (ID required)";
    }
}
