package jungol.배열1;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] num = new int[10];
        int max =0 ;
        int min = 0;
        int [] num2 = new int[10];

        for (int i = 0; i<10; i++) {
            num[i] = sc.nextInt();
            if (num[i] > 0 && (num[i] % 2 ==0 )) {
                num2[i] = num[i];
            } else if (num[i] < 0 && (num[i] % 2 !=0)) {
                num2[i] = num[i];
            }
        }
        max = Arrays.stream(num2).max().getAsInt();
        min = Arrays.stream(num2).min().getAsInt();

        System.out.printf(min + " " +max);

    }
}
