package com.CSC2720;
//2720 HW3
//Dr. Kiril Kuzmin
//By Talha Ansari
//#002587754
public class Tree {
    private Node root;

    public void printNodesDecreasing() {
        printNodesDecreasing(root);
    }

    private void printNodesDecreasing(Node node) {
        if (node == null) return;
        printNodesDecreasing(node.right);
        System.out.print(node.value + " ");
        printNodesDecreasing(node.left);
    }

    public void printLeaves() {
        printLeaves(root);
    }

    private void printLeaves(Node node) {
        if (node == null) return;
        printLeaves(node.right);
        if (isLeaf(node)) System.out.print(node.value + " ");
        printLeaves(node.left);
    }

    private boolean isLeaf(Node node) {
        return (node.left == null) && (node.right == null);
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (node.value < value) {
            node.right = insert(node.right, value);
            return node;
        }

        node.left = insert(node.left, value);
        return node;
    }

}
