package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[10];

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int a = Math.abs(n) % 10;
            count[a]++;
        }

        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                System.out.println(i + " : " + count[i] + "개");
            }
        }
    }
}