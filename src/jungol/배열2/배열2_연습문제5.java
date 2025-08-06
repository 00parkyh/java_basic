package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] sum = new int[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("첫 번째 배열 %d행 ", i + 1);
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("두 번째 배열 %d행 ", i + 1);
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}