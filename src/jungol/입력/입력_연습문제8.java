package jungol.입력;

import java.util.Scanner;

public class 입력_연습문제8 {
    public static void main(String[] args) {
        int num1;
        double num2;
        char a;
        Scanner sc = new Scanner(System.in);

        System.out.println("키를 입력하세요. ");
        num1 = sc.nextInt();
        System.out.println("몸무게를 입력하세요. ");
        num2 = sc.nextDouble();
        System.out.println("이름을 입력하세요. ");
        a = sc.next().charAt(0);

        System.out.printf("키 = %d\n",num1);
        System.out.printf("몸무게 = %.1f\n",num2);
        System.out.printf("이름 = %c\n",a);
    }
}
