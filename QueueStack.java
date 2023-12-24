package com.CSC2720;
import java.util.*;
//CSC2720 Lab 4
//Due 2/9/2022
//Professor Kiril Kuzmin
//By Talha Ansari
public class QueueStack {

    Queue<Integer> In;
    Queue<Integer> Out;
    static int sizeRN;

    public QueueStack() {
        In = new LinkedList<>();
        Out = new LinkedList<>();
        sizeRN = 0;
    }

    // O(1): both the add method and incrementing sizeRN have an O of 1
    // so the method's overall runtime complexity is also O(1).
    public void push(int x) {
        In.add(x);
        sizeRN++;
    }

    // O(n): The method insideOut(), which runs in O(n), is executed
    // so pop() will also have a complexity of O(n).
    public int pop() {
        if (isEmpty()) throw new IllegalStateException();
        insideOut();
        sizeRN--;
        Queue<Integer> q = In;
        In = Out;
        Out = q;
        return Out.remove();
    }

    // O(1): the method only returns the
    // value of SizeRN, which has a
    //runtime complexity of O(1).
    public int size(){return sizeRN;}

    // O(n): Since we need to iterate over the entire
    // queue to move the items into the other queue.
    private void insideOut() {
        if (In.isEmpty()) return;
        while (In.size() > 1) {
            Out.add(In.peek());
            In.remove();
            }
    }

    // O(1): Since we only use 1 O(1) operation.
    public boolean isEmpty() { return In.isEmpty(); }

    // O(n): Since we execute
    // the method insideOut(),
    // which runs in O(n) time.
    public int peek() {
        if (isEmpty()) throw new IllegalStateException();

        insideOut();
        int t = In.peek();
        In.remove();
        Out.add(t);
        Queue<Integer> q = In;
        In = Out;
        Out = q;
        return t;
    }
}