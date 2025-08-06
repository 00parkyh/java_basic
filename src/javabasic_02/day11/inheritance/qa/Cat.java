package javabasic_02.day11.inheritance.qa;

import java.util.Scanner;

public class Cat extends Animal {
    public void meow() {
        System.out.println("야옹하고 울다.");
    }
    static Scanner sc = new Scanner(System.in);
    static Cat obj = new Cat();
    public static void main(String[] args) {

        String food = sc.nextLine();

        obj.meow();

        obj.eat();
    }
}
