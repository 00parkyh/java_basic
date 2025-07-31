package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        int sum=0;
        for (int i = 0; i<10; i++) {
            num[i] = sc.nextInt();
        }
        for (int s = 0; s<10; s++) {
            sum +=num[s];
        }
        System.out.println("총점 = " +sum);
        System.out.printf("평균 = %.1f", (double)sum / num.length);
    }
}
