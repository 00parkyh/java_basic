package java_advanced_01.day17.AnonymousClass.lambdaEx.lambda01;

//함수형 인터페이스임을 보장한다.(선택사항, 커파일 과자에서 추상메소드가 하나인지를 검사하기 때문에
// 정확한 함수형 인터페이스를 작성하는데 도와주는 역할을 하는 어노테이션이다.)
@FunctionalInterface
public interface Calculable {
    void calculate(int num1, int num2);
}
