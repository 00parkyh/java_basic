package jungol.입력;

import java.util.Scanner;

public class 입력_연습문제7 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("두 수를 입력하시오. ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.printf("%d + %d = %d\n",num1,num2,(num1+num2));
        System.out.printf("%d * %d = %d",num1,num2,(num1*num2));
    }
}
