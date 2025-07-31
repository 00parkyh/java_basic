package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int avg = 0;

        for (int i = 0 ; i<20; i ++) {
            num = sc.nextInt();

            if (num ==0) {
                sum += num;
                avg = sum/i;
                break;
            } else if (num !=0) {
                sum += num;
                avg = sum/20;
            }
        }
        System.out.printf(sum + " " + avg);
    }
}
