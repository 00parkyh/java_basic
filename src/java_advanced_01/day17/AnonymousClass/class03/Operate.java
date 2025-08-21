package java_advanced_01.day17.AnonymousClass.class03;

public interface Operate {
    //추상메서드
    int operate(int a, int b);

    //default 메서드
    default void print() {
        System.out.println("print");
    }
}
