package jungol.연산자;

import java.util.Scanner;

public class 연산자_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 개의 수를 입력하시오. ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("%d + %d = %d\n",num1,num2,(num1+num2));
        System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));
        System.out.printf("%d * %d = %d\n",num1,num2,(num1*num2));
        System.out.printf("%d / %d = %d\n",num1,num2,(num1/num2));
        System.out.printf("%d %% %d = %d\n",num1,num2,(num1%num2));
    }
}