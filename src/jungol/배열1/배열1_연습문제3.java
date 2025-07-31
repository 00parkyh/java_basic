package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] num = new int[10];

        for (int i=0; i<10; i++) {
            num[i] = sc.nextInt();
        }
        for (int s= 0; s<10; s++) {
            if (s == 2 || s == 4|| s ==9) {
                System.out.print(num[s] + " ");
            }
        }
    }
}
