package com.CSC2720;
public class QueueStackTest {
    public static void main(String[] args) {
        QueueStack test = new QueueStack();
        test.push(5);
        test.push(10);
        test.push(20);
        test.push(30);
        test.push(40);
        while (!test.isEmpty()) {
            System.out.println(test.In +" "+ test.Out);
            System.out.println(test.pop());
        }
    }
}
