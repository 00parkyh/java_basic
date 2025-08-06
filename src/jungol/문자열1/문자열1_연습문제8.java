package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] b = a.split(" ");

        for (int i = 0; i<b.length; i++) {
            System.out.println(b[i]);
        }

    }

}
