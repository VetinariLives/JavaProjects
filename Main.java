package com.CSC2720;

public class Main {

    public static void main(String[] args) {
        Heap hh = new Heap(8);
        hh.insert(5);
        System.out.println(hh);
        hh.insert(8);
        System.out.println(hh);
        hh.insert(7);
        System.out.println(hh);
        hh.insert(1);
        System.out.println(hh);
        hh.insert(6);
        System.out.println(hh);
        hh.insert(2);
        System.out.println(hh);
        hh.insert(3);
        System.out.println(hh);
        hh.insert(4);
        System.out.println(hh);
        hh.remove();
        System.out.println(hh);

    }
}
