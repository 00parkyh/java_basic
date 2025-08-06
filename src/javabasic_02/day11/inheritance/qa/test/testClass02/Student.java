package javabasic_02.day11.inheritance.qa.test.testClass02;

public class Student {
    private String name;
    private int age;
    private int id;

    public void print() {
        System.out.println("이름 : "+getName()+ " 나이 : " + getAge()+ " 학번 : "+getId());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
