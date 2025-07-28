package jungol.연산자;

import java.util.Scanner;

public class 연산자_연습문제2_2 {
    public static void main(String[] args) {
        int num1,num2,num3,num4,num5;
        Scanner sc = new Scanner(System.in);
        System.out.print("5개의 수를 입력하시오. ");

        num1 = sc.nextInt() + 3;
        num2 = sc.nextInt() - 3;
        num3 = sc.nextInt() * 3;
        num4 = sc.nextInt() /3;
        num5 = sc.nextInt() % 3;

        System.out.printf("%d %d %d %d %d",num1, num2, num3, num4, num5);

    }
}

