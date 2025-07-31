package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];
        int count = 0;

        for (int i = 0; i<num.length;i++) {
            num[i] = sc.nextInt();
            if (num[i] == -1) {
                break;
            }
            count ++;
        }
        if (count <=2 ) {
            for (int x = 0; x<=count-1; x++) {
                System.out.print(num[x] + " ");
            }
        } else {
            for (int s = count -3; s<=count-1; s++){
                System.out.print(num[s]+" ");
            }
        }
    }
}
