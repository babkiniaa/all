package org.example;

public class Pair<C, T> {
    private C Key;
    private T value;

    public Pair(C key ,T value){
        this.Key = key;
        this.value = value;
    }

    public <T> T getValue(){
        return (T) value;
    }

    public <C> C getKey(){
        return (C) Key;
    }
    public static void main(String[] args) {
        Pair<Integer, String> Pai = new Pair<>(1, "S12");
        Integer I = Pai.getKey();
        String J = Pai.getValue();
        System.out.println(I);
        System.out.println(J);
    }

}