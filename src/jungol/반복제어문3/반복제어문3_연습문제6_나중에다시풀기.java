package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_연습문제6_나중에다시풀기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 1;

        for (int i = 1; i<=num; i ++){
            for (int s = 1; s<=i; s++) {
                System.out.print(x + " ");
                x ++;
            }
            System.out.println();
        }
    }
}
