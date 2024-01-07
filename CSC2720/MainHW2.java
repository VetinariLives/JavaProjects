package com.CSC2720;
import java.util.*;
//2720 HW2
//Dr. Kiril Kuzmin
//By Talha Ansari
public class MainHW2 {

    public static int majorityElement(int[] array) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int answer = -1;
        for (int j : array) {
            if (hash.containsKey(j))
                hash.put(j, hash.get(j) + 1);
            else hash.put(j, 1);
            if (hash.get(j) > array.length / 2)
                answer = j;
        }
        return answer;
    }

    public static int pairsWithDifference(int diff, int[] array) {
        int pairs = 0;
        Set<Integer> set = new HashSet<>();
        for (int i: array)
            set.add(i);
        for (int i: array) {
            if (set.contains(i + diff) || set.contains(i - diff))
                pairs++;
            set.remove(i);
        }
        return pairs;
    }

    public static boolean containsSubarrayWithSum(int sum, int[] array) {
        Set<Integer> set = new HashSet<>();
        int add = 0;
        for (int i: array) {
            add += i;
            if (i == sum || add == sum || set.contains(add))
                return true;
            set.add(add);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 5, 2, 2, 2, 8, 2, 100, 13, 2, 9, 2, 2, 2, 7 };
        System.out.println(majorityElement(array1));
        int[] array2 = { 1, 4, 10, 13, 15 };
        System.out.println(pairsWithDifference(3, array2));
        int[] array3 = { 2, 3, 4, -8, 1, -2, 8, 7 };
        System.out.println(containsSubarrayWithSum(-10, array3));
    }
}
