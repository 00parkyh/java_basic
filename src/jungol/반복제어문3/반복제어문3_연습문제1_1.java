package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_연습문제1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;

        for(int i =1; i<num; i++) {
            count ++;
            sum +=i;
            if(sum>num) break;
        }

        System.out.printf("%d ",count);
        System.out.printf("%d",sum);
    }
}