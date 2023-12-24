package com.CSC2720;
import java.util.*;
public class Array {
    public int[] Array = new int[5];

    public void print(){
        System.out.print(Arrays.toString(Array));
    }
    public int[] insert(int naya) {
        for (int i:
             Array) {
            if (i.equals(null)) {
                i = naya;
                break;
            }
        }
        return Array;
    }
    public int[] removeAt(int index) {

    }
}
