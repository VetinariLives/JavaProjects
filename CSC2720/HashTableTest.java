package com.CSC2720;

import java.util.Scanner;

public class HashTableTest {

    public static void main(String[] args) {
	HashTable arr = new HashTable(8);
	arr.put(5, "fhuebfgue");
	arr.put(6, "fhuebfgue");
	arr.put(7, "fhuebfgue");
	arr.put(8, "fhuebfgue");
	arr.put(9, "fhuebfgue");
		System.out.println(arr.get(8));
    }
}
