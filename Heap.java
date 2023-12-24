package com.CSC2720;
import java.util.Arrays;
//CSC 2720 Lab 8
//Due 3/09/2022
//By Talha Ansari
public class Heap {
    private final int[] items;
    private int size;

    public Heap(int capacity) { items = new int[capacity]; }

    public String toString() {
        var content = Arrays.copyOfRange(items, 0, size);
        return Arrays.toString(content);
    }

    private void swapTwoItemsAt(int index1, int index2) {
        int temp = items[index1];
        items[index1] = items[index2];
        items[index2] = temp;
    }

    public void insert(int value) {
        if (isFull())  throw new IllegalStateException();
        items[size] = value;
        size++;
        bubbleUp();
    }

    public int remove() {
        if(isEmpty()) throw new IllegalStateException();
        int root = items[0];
        items[0] = items[size - 1];
        size--;
        bubbleDown();
        return root;
    }
    public boolean isEmpty() { return size == 0; }

    public boolean isFull() { return size == items.length; }

    private void bubbleUp() {
        int index = size - 1;
        while (index >= 0 && items[index] > parent(index)) {
            int parentIndex = parentIndex(index);
            swapTwoItemsAt(index, parentIndex);
            index = parentIndex;
        }
    }

    private void bubbleDown() {
        int index = 0;
        while (index <= size && !isValidParent(index)) {
            int largerChildIndex = largerChildIndex(index);
            swapTwoItemsAt(index, largerChildIndex);
            index = largerChildIndex;
        }
    }

    private boolean hasLeftChild(int index) { return leftChildIndex(index) <= size; }

    private boolean hasRightChild(int index) { return rightChildIndex(index) <= size; }

    private int largerChildIndex(int index) {
        if(!hasLeftChild(index)) return index;

        if(!hasRightChild(index)) return leftChildIndex(index);

        if (leftChild(index) > rightChild(index)) return leftChildIndex(index);

        return rightChildIndex(index);
    }

    private boolean isValidParent(int index) {
        if(!hasLeftChild(index)) return true;
        boolean isValid = (items[index] >= leftChild(index));
        if(hasRightChild(index)) isValid &= (items[index] >= rightChild(index));
        return isValid;
    }

    private int parent(int index) { return items[parentIndex(index)]; }

    private int leftChild(int index) { return items[leftChildIndex(index)]; }

    private int rightChild(int index) { return items[rightChildIndex(index)]; }

    private int parentIndex(int index) { return (index - 1) / 2; }

    private int leftChildIndex(int index) { return index * 2 + 1; }

    private int rightChildIndex(int index) { return index * 2 + 2; }
}
