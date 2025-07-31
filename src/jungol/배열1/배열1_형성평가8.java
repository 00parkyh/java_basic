package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];
        int count =0;
        int sum = 0;
        double avg = 0;

        for (int i = 0; i<100; i++) {
            num[i] = sc.nextInt();

            if (num[i] ==0) {
                for (int s = 0; s<i; s++) {
                    if (num[s]%5==0) {
                        count ++;
                        sum += num[s];
                    }
                }
                break;

            }
        }
        System.out.printf("Multiples of 5 : %d\n", count );
        System.out.printf("sum : %d\n", sum);
        System.out.printf("avg : %.1f",(double)sum/count);
    }
}
