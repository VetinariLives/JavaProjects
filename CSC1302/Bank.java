package com.CSC1302;
import java.util.Scanner;
import java.util.Random;
//Name: Talha Ansari

public class Bank {
//This program generates an array of PayPalAccount objects of a user-inputted length.
//it then initializes each object with a random balance.
//The program then determines if there is an account with the 1st 3 digits of my PantherID as its unique id
//if not, it sets the last array elements id to those digits, and transfers the balance of the 1st array element to the last array element
//if so, it sets the balance of the account with the 1st 3 digits of my ID to be equal to the value of my last 5 ID digits divided by 100
//it then finds and prints out the average account balance, the largest balance, and the lowest balance
    public static void main(String[] args) {
        Random r = new Random();
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of accounts you wish to generate: ");
        PayPalAccount[] arr = new PayPalAccount[console.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new PayPalAccount(r.nextDouble() * 1000.0);
        }
        boolean flag = false;
        int hold = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAccountId() == 002) {
                flag = false;
                hold = i;
                break;
            } else flag = true;
        }
        if (flag) {
            arr[arr.length - 1].setBalance(arr[0].getBalance() + arr[arr.length - 1].getBalance());
            arr[arr.length - 1].setAccountId(002);
            arr[0].setBalance(0.0);
        }
        else{
            arr[hold].setBalance(87754/100.0);
            System.out.println("My Pather ID is 141-88-2014; my bank account ID is " + arr[hold].getAccountId() + " and balance is $" + arr[hold].getBalance());
        }
        double total = 0.0;
        PayPalAccount max = arr[0];
        PayPalAccount min = arr[0];
        for (PayPalAccount p: arr) {
            total += p.getBalance();
            if (p.getBalance() > max.getBalance())
                max = p;
            if (p.getBalance() < min.getBalance())
                min = p;
        }
        System.out.println("The average balance is: $" + (total/arr.length));
        System.out.println("The account with the largest balance: accountID " + max.getAccountId() + ", balance = $" + max.getBalance());
        System.out.println("The account with the lowest balance: accountID " + min.getAccountId() + ", balance = $" + min.getBalance());
    }
}
