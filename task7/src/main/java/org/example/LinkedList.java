package org.example;

public class LinkedList {
    private Node root;

    public LinkedList() {
    }

    public void add(Object item) {
        Node newNode = new Node(item);
        Node lastNode = findLast();
        if (lastNode == null) {
            root = newNode;
        } else {
            lastNode.setNext(newNode);
        }
    }

    private Node findLast() {
        Node last = root;
        while (root != null && last.getNext() != null) {
            last = last.getNext();
        }
        return last;
    }

    public Object get(int index) {
        Node last = root;
        while (last.getNext() != null && index > 1) {
            last = last.getNext();
            index = index - 1;
        }
        if (index != 1) {
            return "Что такое, коллекция не настолько большая, введите число по меньше";
        } else {
            return last.getValue();
        }
    }

    public int size() {
        Node last = root;
        int index = 0;
        while (last != null) {
            index = index + 1;
            last = last.getNext();
        }
        return index;
    }
}


