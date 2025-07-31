package jungol.배열1;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i<10; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.stream(num).max().getAsInt());
    }
}
