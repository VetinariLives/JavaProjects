package com.CSC1302;
//Name: Talha Ansari
public class AdvanceTicket extends Ticket{
    /*This program creates a class of AdvanceTicket objects, and is a subclass of Ticket.java
    The class has 1 instance field: int days, which is used to hold how many days in advance the ticket was purchased
    The class has a constructor, which accepts 2 ints as a parameter
    It uses the first as the argument in the parent constructor
    it uses the second to determine price
    if it is more than 9, the price is 30
    else the price is 40*/
    int days;
    public AdvanceTicket(int number, int days) {
        super(number);
        if (days > 9) price = 30.0;
        else price = 40;
    }
}
