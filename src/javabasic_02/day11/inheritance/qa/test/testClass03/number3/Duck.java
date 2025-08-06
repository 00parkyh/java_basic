package javabasic_02.day11.inheritance.qa.test.testClass03.number3;

public class Duck {
    String name;
    int legs;
    int length;

    public void fly() {
        System.out.println("오리"+"("+getName()+")는 날지 않습니다.");
    }
    public void sing() {
        System.out.println("오리"+"("+getName()+")가 소리내어 웁니다.");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "참새의 이름은 "+getName()+" 입니다.";
    }

    public String getName() {
        return name;
    }
}
