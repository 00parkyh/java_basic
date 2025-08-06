package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제3 {
    public static void main(String[] args) {
        String a = "jungol olympiad";
        Scanner sc = new Scanner(System.in);
        int n ;
        char[] b = new char[5];

        for (int i = 0; i<5; i++) {
            n = sc.nextInt();
            b[i] = a.charAt(n);
        }

        for (int i = 0; i<5; i++) {
            System.out.print(b[i]);
        }
    }
}
