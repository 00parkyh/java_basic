package javabasic_02.day10;

public class Printer {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }

    private void println(int n) {
        System.out.println(n);
    }
    private void println(boolean result) {
        System.out.println(result);
    }
    private void println(double a) {
        System.out.println(a);
    }
    private void println(String b) {
        System.out.println(b);
    }
}
