package day05;

import java.util.Scanner;

public class StartEx06 {
    public static void main(String[] args) {
        int row,col;

        Scanner in = new Scanner(System.in);
        System.out.println("몇행으로 피라미드를 만들까요?");
        int n = in.nextInt();

        for (row = 1; row<=n ; row++) {            //사용자 입력값이 row(행) 결정
            for (col = row; col<n; col++) {
                System.out.print(" ");
            }
            for (col = 1; col<= (2*row -1 ); col++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
