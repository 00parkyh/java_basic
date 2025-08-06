package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제1 {
    public static void main(String[] args) {
        char a ;
        Scanner sc = new Scanner(System.in);

        while (true) {
            a = sc.next().charAt(0);
            int b = (int) a;
            System.out.printf("%s -> %d\n",a,b);
            if ( a =='0') break;
        }
    }
}
