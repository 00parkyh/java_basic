package java_advanced_01.day14.collection;

import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> ms = new ArrayList<>();

    public void push(T item) {
        ms.add(item);
    }

    public T pop() {
        if (ms.isEmpty()) {
            return null;
        }
        return ms.remove(ms.size()-1);
    }

    public static void main(String[] args) {
        MyStack<Integer> ms = new MyStack<>();

        ms.push(1);
        ms.push(10);
        ms.push(20);
        ms.push(30);

        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
    }
}
