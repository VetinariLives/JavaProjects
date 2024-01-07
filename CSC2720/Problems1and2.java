package com.CSC2720;

public class Problems1and2 {

    public static void main(String[] args) {
	// write your code here
        int length = 6;
       /* Problem1 arr = new Problem1(length);
        for (int i = -3; i < length - 3; i++) {
            arr.insert(i);
        }
// problem 1.a
        System.out.println(arr.min());
// problem 1.b
        arr.reverse();
        arr.print();
*/
        Problem2 list = new Problem2();
        for (int i = 0; i < length; i++) {
            list.addFirst(i);
        }
// problem 2
        list.printMiddle();
        list.deleteLast();
        list.printMiddle();

    }
}
