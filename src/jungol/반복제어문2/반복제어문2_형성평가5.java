package 반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가5 {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;

        Scanner sc =new Scanner(System.in);
        int [] a = new int[10];
        for (int i = 0; i<10; i++) {
            a[i] = sc.nextInt();

            if(a[i] % 2 == 0 ) {
                ++even ;
            } else ++odd;
        }
        System.out.printf("even : %d\n", even);
        System.out.printf("odd : %d",odd);

    }
}
