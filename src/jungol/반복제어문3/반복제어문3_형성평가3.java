package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i<=num; i++) {
            for (int s = 1; s<=i; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = num; j>0; j--) {
            for(int x = 1; x<j ;x++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
