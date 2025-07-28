package jungol.연산자;

import java.util.Scanner;

public class 연산자_자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum = num1+num2+num3;
        int avg = (int)(sum/3) ;

        System.out.printf("sum : %d\n",sum);
        System.out.printf("avg : %d", avg);
    }
}
