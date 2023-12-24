package com.CSC1302;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 13
public class PayPalAccount { /*
This program creates a class of PayPalAccount objects
The class has 1 class variable, count, which is used to formulate a unique account id for each account
It also has 2 private instance variables:
    double balance
    int accountId
The class has 6 instance methods:
    a constructor, which accepts a double as a parameter
    a getter for balance
    a setter for balance
    a getter for accountId
    a setter for accountId
    a toString method

  */private double balance;
    private static int count = 0;
    private int accountId;

    public PayPalAccount(double balance) {
        this.balance = balance;
        this.accountId = ++count;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountId() {
        return this.accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "AccountID: " + accountId + "\nBalance: $" + balance;
    }
}
