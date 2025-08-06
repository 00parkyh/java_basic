package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String[] c = a.split(" ");

        if (c[0].length()<=49 && c[1].length()<=49) {

            if (c[0].length()>c[1].length()) {
                System.out.println(c[1]);
                System.out.println(c[0]);
            } else if (c[0].length() == c[1].length()){
                System.out.println(c[0]);
                System.out.println(c[1]);

            } else {
                System.out.println(c[0]);
                System.out.println(c[1]);
            }
        } else {
            System.out.println("49자가 넘습니다. 다시 입력하세요.");
        }
    }
}
