package com.CSC1302;
//Name: Talha Ansari
public class WalkupTicket extends Ticket {/*
    This program creates a class of WalkupTicket objects, and is a subclass of Ticket.java
    The class has a constructor, which accepts a int as a parameter and uses it as the argument in the parent constructor
    it then sets the price equal to 50
  */public WalkupTicket(int number) {
        super(number);
        price = 50.0;
    }
}
