package jungol.입력;

import java.util.Scanner;

public class 입력_형성평가4 {
    public static void main(String[] args) {
        int num1,num2,num3,sum;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        sum = num1 + num2 +num3;

        System.out.printf("sum = %d",sum);

    }
}
