package com.CSC2720;

public class Main {

    public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.addFirst(5);
	ll.addFirst(5);
	ll.addFirst(5);
	ll.addFirst(5);
	ll.addFirst(5);
	ll.addFirst(5);
	ll.print();
	ll.removeDuplicates();
	ll.print();
    }

}
