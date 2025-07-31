package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];
        int count = 0;

        for (int i = 0; i<100; i++) {
            num[i] = sc.nextInt();
            count ++;
            if (num[i] ==0) {
                for (int s = 0; s<i; s++) {
                    if (num[s] %2 ==0) {
                        num[s] = num[s]/2;
//                        System.out.print(num[s]/2 + " ");
                    } else if (num[s]%2 !=0) {
                        num[s] = num[s]*2;
//                        System.out.print(num[s]*2 + " ");
                    }
                }
                break;
            }
        }
        System.out.println(count-1);
        for (int j = 0; j<count-1; j ++) {
            System.out.print(num[j] + " ");
        }
    }
}
