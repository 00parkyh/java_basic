package javabasic_02.day11.inheritance.qa.test.testClass03.number3;

public class Sparrow {
    String name;
    int legs;
    int length;

    public void fly() {
        System.out.println("참새"+"("+getName()+")가 날아다닙니다.");
    }
    public void sing() {
        System.out.println("참새"+"("+getName()+")가 소리내어 웁니다.");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "오리의 이름은 "+getName()+" 입니다.";
    }

    public String getName() {
        return name;
    }
}
