package com.CSC2720;

public class LinkedListTest {

    public static void main(String[] args) {
	// write your code here
        LinkedList problemOne = new LinkedList();
        problemOne.addLast(2);
        problemOne.addLast(4);
        problemOne.addLast(8);
        problemOne.addFirst(-2);
        problemOne.addFirst(-4);
        problemOne.addLast(9);
        problemOne.print();
        System.out.println(problemOne.indexOf(4));
        System.out.println(problemOne.contains(9));
        for (int i = 0; i < 6; ++i) {
            problemOne.deleteLast();
            problemOne.print();
        }

        LinkedList problemTwo = new LinkedList();
        problemTwo.addLast(2);
        problemTwo.addLast(4);
        problemTwo.addLast(8);
        problemTwo.addFirst(-2);
        problemTwo.addFirst(-4);
        problemTwo.addLast(9);
        problemTwo.print();
        problemTwo.reverse();
        problemTwo.print();

    }
}
