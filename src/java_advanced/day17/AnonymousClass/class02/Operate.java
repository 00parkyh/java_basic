package java_advanced.day17.AnonymousClass.class02;

//연산식을 추상화한 인터페이스
@FunctionalInterface
public interface Operate {
    int operate(int a, int b);
}
//@FunctionalInterface 는 "이 인터페이스가 함수형 인터페이스임을 보장한다" 는 어노테이션입니다.
//함수형 인터페이스란 추상 메서드를 딱 하나만 가지는 인터페이스를 말합니다.
