package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int odd =0;
        int even = 0;

        for (int i = 0; i<num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int o = 0; o<num.length; o+=2) {
            odd += num[o];
        }
        for (int e = 1; e<num.length; e+=2) {
            even += num[e];
        }
        System.out.println("odd : "+ odd);
        System.out.println("even : "+ even);

    }
}
