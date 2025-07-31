package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[100];

        for (int i =0; i<101; i++) {
            num[i] = sc.nextInt();
            if (num[i] ==0) {
                for (int s = 0; s<i; s++) {
                    if (s % 2 !=0 ) {
                        System.out.print(num[s] + " ");
                    }
                }
                break;
            }
        }
    }
}
