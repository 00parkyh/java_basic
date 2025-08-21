package java_advanced_01.day17.AnonymousClass.lambdaEx;

public class Main1 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Hello lambda");
            }
        };

        Runnable runnable1 = () -> {System.out.println("Hello lambda1");};
//        Runnable runnable1 = () -> System.out.println("Hello lambda1"); 도 가능
    }
}
