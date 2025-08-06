package javabasic_02.day11.inheritance.qa;

public class Kitten extends Cat{
    public void meow2() {

        System.out.print("새끼 고양이가 ");
        meow();
    }
    static Kitten objKitten = new Kitten();

    public static void main(String[] args) {
        objKitten.meow2();
        objKitten.meow();
        objKitten.eat();
    }
}
