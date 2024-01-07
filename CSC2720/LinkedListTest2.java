package com.CSC2720;

public class LinkedListTest2 {

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
