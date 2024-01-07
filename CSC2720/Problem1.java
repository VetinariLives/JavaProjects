package com.CSC2720;

public class Problem1 {
    int[] array;
    int elementN;
    public Problem1(int size) {
        array = new int[size];
    }

    public void insert (int value) {
        if (array.length == 0) {
            int[] extendedArray = new int[1];
            array = extendedArray;
        }
        if (array.length == elementN) {
            int[] extendedArray = new int[elementN * 2];
            for (int i = 0; i < elementN; ++i) {
                extendedArray[i] = array[i];
            }
            array = extendedArray;
        }
        array[elementN] = value;
        elementN++;
    }

    public int min () {
        //the run-time complex is O(n), because
        //the loop must iterate over every single element in
        //the array
        if (array.length == 0) throw new IllegalStateException();
        if (array.length == 1) return array[0];
        int currentM = array[0];
        for (int i: array) {
            if (i < currentM) currentM = i;
        }
        return currentM;
    }
    
    public void reverse () {
        //the run-time complexity is O(n), because
        //the loop iterates over every single element contained in the array
        int[] reversed = new int[elementN];
        int r = 0;
        for (int i = elementN-1; i >= 0; i--) {
            reversed[r] = array[i];
            r++;
        }
        array = reversed;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < elementN; ++i)
            if (i < elementN - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        System.out.println("]");
    }
}
