package day02;

import java.util.Scanner;

public class FourArithmetic {   //자바에서는 클래스를 선언할때 클래스명은 파스칼 방식 네이밍, 변수나 메소드를 표키 카델,스네이크 네이밍륭 적용
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a값을 입력하세요. : ");
        a = sc.nextInt();
        System.out.print("b값을 입력하세요. : ");
        b = sc.nextInt();

        System.out.println("a+b = "+ a+b);
        System.out.println("a-b = "+ (a-b));
        System.out.println("a*b = "+ a*b);
        System.out.println("a/b = "+ a/b);
        System.out.println("평균 = "+ (a+b)/2);

        System.out.println("===============");

        int kor = 77; int eng = 87;

        System.out.println("총점 : "+(kor+eng));
        System.out.println("평균 : "+(kor+eng)/2);
    }
}
