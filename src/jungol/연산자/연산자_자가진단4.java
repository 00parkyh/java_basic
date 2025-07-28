package jungol.연산자;

import java.util.Scanner;

public class 연산자_자가진단4 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = num1++ * --num2;
        System.out.printf("%d %d %d",num1,num2,num3);
    }
}