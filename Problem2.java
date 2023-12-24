package com.CSC2720;
import java.util.*;

public class Problem2 {

    private Node sar;
    private Node peir;

    private boolean aglaaHai(Node n) {
        return n.next != null;
    }

    private boolean khaaliHai() {
        return sar == null;
    }

    public Node previous(Node node) {
        if (khaaliHai()) throw new NoSuchElementException("Khaali hai yaar");
        Node abhi = sar;
        while (abhi.next != node) {
            if (abhi.next == null) throw new NoSuchElementException("Or nahi hai yaar");
            abhi = abhi.next;
        }
        return abhi;
    }

    public void print() {
        if (khaaliHai()) throw new NoSuchElementException("Khaali hai yaar");
        Node node = sar;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

    public void addFirst(int f) {
        Node n = new Node(f);
        if (khaaliHai()) sar = peir = n;
        else {
            n.next = sar;
            sar = n;
        }
    }

    public void addLast(int l) {
        Node n = new Node(l);
        if (khaaliHai()) sar = peir = n;
        else peir = peir.next = n;
    }

    public int indexOf(int o) {
        if (khaaliHai()) throw new NoSuchElementException("Khaali hai yaar");
        int index = 0;
        Node abhi = sar;
        while (abhi != null) {
            if (abhi.value == o) return index;
            index++;
            abhi = abhi.next;
        }
        return -1;
    }

    public void deleteFirst() {
        if (khaaliHai()) throw new NoSuchElementException("Khaali hai yaar");
        if (sar == peir) {
            sar = peir = null;
            return;
        }
        Node dusra = sar.next;
        sar.next = null;
        sar = dusra;
    }

    public void deleteLast() {
        if (khaaliHai()) throw new NoSuchElementException("Khaali hai yaar");
        if (sar == peir) {
            sar = peir = null;
            return;
        }
        Node taqribanAakhri = previous(peir);
        taqribanAakhri.next = null;
        peir = taqribanAakhri;
    }

    public void reverse() {
        if (khaaliHai()) throw new NoSuchElementException("Khaali hai yaar");
        if (sar == peir) return;
        Node pichlaa = null;
        Node yeh = sar;
        Node aglaa = null;
        while (yeh != null) {
            aglaa = yeh.next;
            yeh.next = pichlaa;
            pichlaa = yeh;
            yeh = aglaa;
        }
        sar = pichlaa;
    }

    public boolean contains(int v) {
        if (khaaliHai()) throw new NoSuchElementException("Khaali hai yaar");
        Node yeh = sar;
        while (yeh != null) {
            if (yeh.value == v) return true;
            yeh = yeh.next;
        }
        return false;
    }

    public void printMiddle() {
        //here the run-time complexity is O(n/2) which is just O(n), as the fast pointer traverses
        //every other element of the linkedlist
        if (khaaliHai()) throw new NoSuchElementException("Khaali hai yaar");
        if (sar == peir) {
            System.out.println(sar.value);
            return;
        }
        Node countby1 = sar;
        Node countby2 = sar;
        while (countby1 != null && countby2.next != null && countby2.next.next != null) {
            countby1 = countby1.next;
            countby2 = countby2.next.next;
        }
        if (countby2.next == null) {
            System.out.println(countby1.value);
            return;
        }
        System.out.println(countby1.value + " " + countby1.next.value);

    }

    class Node {
        private int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }

}
