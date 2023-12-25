package com.CSC2720;
//2720 HW3
//Dr. Kiril Kuzmin
//By Talha Ansari
//#002587754
public class Main {

	public static boolean isMinHeap(int[] array) {
		if (array.length <= 1) return true;
		//starting at 2nd index, checks if the elements value is smaller than its parents, if so, returns false
		for(int i = 1; i < array.length; i++) if (array[i] < array[(i - 1) / 2]) return false;
		return true;
	}

	public static void main(String[] args) {

		//Problem 1
		int[] arr1 = {0,3,2,8,10,9,7};
		System.out.println(isMinHeap(arr1));
		int[] arr2 = {1,3,2,8,2,10};
		System.out.println(isMinHeap(arr2));
		int[] arr3 = {1,3,2,8,10,9};
		System.out.println(isMinHeap(arr3));

		//Problems 2 & 3
		Tree tree = new Tree();
		tree.insert(7);
		tree.insert(4);
		tree.insert(9);
		tree.insert(1);
		tree.insert(5);
		tree.insert(6);
		
		// problem 2 tested
		tree.printNodesDecreasing(); 
		System.out.println();
		
		// problem 3 tested
		tree.printLeaves();
	}

}
