package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] num = new int [5];

        for (int i = 0; i<5; i++) {
            num[i] = sc.nextInt();
        }
        for (int s = 0; s<5; s++) {
            System.out.print(num[s] + " ");
        }
    }
}
