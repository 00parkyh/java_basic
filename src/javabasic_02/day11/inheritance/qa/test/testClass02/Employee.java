package javabasic_02.day11.inheritance.qa.test.testClass02;

public class Employee {
    private String name;
    private int age;
    private String dept;

    public void print() {
        System.out.println("이름 : "+getName()+ " 나이 : " + getAge()+ " 부서 : "+getDept());
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
