package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i<=num; i++) {
            for (int s = 0; s < num-i ; s ++) {
                System.out.print(" ");
            }
            for (int q = 0; q<i; q++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
