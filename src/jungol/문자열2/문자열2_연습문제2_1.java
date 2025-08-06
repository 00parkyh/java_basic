package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제2_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String a = sc.nextLine();

            if (a.length()>=49) {
                System.out.println("문장은 49자 이하여야 합니다.");
            } else {
                String[] b = a.split(" ");

                for (int i = 0; i<b.length; i++) {
                    System.out.println(b[i]);
                }
                break;
            }
        }
    }
}
