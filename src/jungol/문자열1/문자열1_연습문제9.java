package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제9 {
    //강사님
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int n = a.length();

        for (int i = 1; i <= n; i++) {
            System.out.println(a.substring(i) + a.substring(0,i));
        }

    }
}
