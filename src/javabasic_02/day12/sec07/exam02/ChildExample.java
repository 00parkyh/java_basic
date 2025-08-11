package javabasic_02.day12.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {
		//자식 객체 생성
		Child child = new Child();
		child.method1();
		//자동 타입 변환
		Parent parent = child;

		//메소드 호출
		parent.method1();
		parent.method2();
		//parent.method3(); 는 불가 메소드3는 child 꺼이기 때문에

		Child child1 = (Child) parent;
		child1.method3();
	}
}