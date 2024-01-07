package com.CSC2720;
//2720 Lab 5
//Dr. Kiril Kuzmin
//TA Akshay Juyal
//By Talha Ansari
//Due 2/16/2022

public class HashTable {

    private final int capacity;
    public LinkedEntry[] table;

    public HashTable(int capacity) {
        table = new LinkedEntry[capacity];
        this.capacity = capacity;
    }

    //this functions generates the unique hash code for each entry
    //runs in O(1) because it only has 1 operation
    private int hash(int key) { return key % capacity; }

    //the runtime complexity is O(n) because
    //in the worst case the loop will have to
    //iterate through a very large LinkedList
    public void put(int key, String value) {
        if (value.equals(null)) throw new IllegalArgumentException();
        //if hash has not yet been initialized
        if (table[hash(key)] == null) {
            //initializes the hash's LinkedList
            table[hash(key)] = new LinkedEntry(key, value);
            return;
        }
        //if the hash has already been initialized
        if (table[hash(key)] != null) {
            //initializes LinkedList en because 2 letters are easier to type than table[hash(key)]
            LinkedEntry en = table[hash(key)];
            //iterates thru LinkedList to find the end or the entry with the key
            while (en.next != null && en.key != key) en = en.next;
            //if the key already exists than replaces value
            if (en.key == key) en.val = value;
            //if the key does not exist than adds new entry
            else en.next = new LinkedEntry(key, value);
        }
    }

    //the runtime complexity is O(n) because
    //in the worst case the loop will have to
    //iterate through a very large LinkedList
    public String get(int key) {
        if (table[hash(key)] == null) throw new IllegalArgumentException();
        //initializes LinkedList en because 2 letters are easier to type than table[hash(key)]
        LinkedEntry en = table[hash(key)];
        //iterates thru LinkedList to find the end or the entry with the key
        while (en.next != null && en.key != key) en = en.next;
        if (en == null) throw new IllegalArgumentException();
        //returns the entry's value
        else return en.val;
    }

    //the runtime complexity is O(n) because
    //in the worst case the loop will have to
    //iterate through a very large LinkedList
    public void remove(int key) {
        if (table[hash(key)] == null) throw new IllegalArgumentException();
        //initializes LinkedList en because 2 letters are easier to type than table[hash(key)]
        LinkedEntry en = table[hash(key)];
        //initializes a counter to keep track of the previous entries
        LinkedEntry prev = null;
        //iterates thru LinkedList to find the end or the entry with the key
        while (en.next != null && en.key != key) {
            prev = en;
            en = en.next;
            //if/when we find the entry with the key
            if (en.key == key) {
                //if it's the first entry in the LinkedList
                //then it's replaced with the entry after it
                if (prev == null) table[hash(key)] = en.next;
                //else the prev's next is replaced with
                //the target entry's next
                else prev.next = en.next;
            }
        }


    }

    private static class LinkedEntry {
        private int key;
        private String val;
        private LinkedEntry next;

        public LinkedEntry(int key, String val) {
            this.key = key;
            this.val = val;
            this.next = null;
        }
    }
}
