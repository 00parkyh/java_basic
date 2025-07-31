package jungol.배열1;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[101];
        int [] num2 = new int[101];

        for (int i = 0; i<101; i++) {
            num[i] = sc.nextInt();
            if (num[i] == 999) {
               num2 = new int[i];

                for (int s = 0; s<i; s++) {
                    num2[s] = num[s];
                }
                break;
            }

        }
        System.out.println("max : " + Arrays.stream(num2).max().getAsInt());
        System.out.println("min : " + Arrays.stream(num2).min().getAsInt());
    }
}
