package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (sum<num) {
            sum +=i;
            i++;
        }
        System.out.printf("%d ",i-1);
        System.out.printf("%d",sum);
    }
}
