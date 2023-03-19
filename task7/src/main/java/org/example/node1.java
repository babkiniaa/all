package org.example;

class node1<T> {
    private T value;
    private node1 next;

    public node1(T value) {
        this.value = value;
        this.next = null;
    }

    public node1(T value, node1 next) {
        this.value = value;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public node1 getNext() {
        return next;
    }

    public void setNext(node1 next) {
        this.next = next;
    }
}

