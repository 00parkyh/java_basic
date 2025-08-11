package javabasic_02.day12.sec06.package2;


import javabasic_02.day12.sec06.package1.A;

public class D  extends A {
	//생성자 선언
    public D() {
        super();    //extends A의 기본 생성자를 호출하여라
    }

	//메소드 선언
    public void method1() {     //상속을 통해서만 사용가능하다.
        this.field = "value";
        this.method();
    }

    public void method2() {     //직접 객체 생성해서 사용 안됨
//        A a = new A();
//        a.field = "value";
//        a.method();
    }

	//메소드 선언

}