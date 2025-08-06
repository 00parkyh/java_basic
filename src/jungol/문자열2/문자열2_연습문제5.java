package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String[] b = a.split(" ");
        System.out.print(b[1]);
        System.out.println(b[0]);

    }
}
