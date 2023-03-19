package org.example;

public class LinkedListOOP {
    private node1<Integer> root;

    public LinkedListOOP() {
    }

    public void add(Object item) {
        node1<Integer> newNode = new node1(item);
        node1<Integer> lastNode = findLast();
        if (lastNode == null) {
            root = newNode;
        } else {
            lastNode.setNext(newNode);
        }
    }

    private node1<Integer> findLast() {
        node1 last = root;
        while (root != null && last.getNext() != null) {
            last = last.getNext();
        }
        return last;
    }

    public int get(int index) {
        node1<Integer> last = root;
        while (last.getNext() != null && index > 1) {
            last = last.getNext();
            index = index - 1;
        }
        if (index != 1) {
            return -1;
        } else {
            return (int)last.getValue();
        }
    }

    public int size() {
        node1<Integer> last = root;
        int index = 0;
        while (last != null) {
            index = index + 1;
            last = last.getNext();
        }
        return index;
    }
}
//class Main{
//    public static void main(String[] args) {
//        LinkedListOOP LLO = new LinkedListOOP();
//        LLO.add(13);
//        LLO.add(11);
//        LLO.add(12);
//        System.out.println(LLO.get(1));
//        System.out.println(LLO.get(4));
//        System.out.println(LLO.size());
//    }
//}