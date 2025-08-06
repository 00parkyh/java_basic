package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제1 {
    //단어 길이 20자 제한하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[5];

        for (int i = 0; i<5; i++) {
            a[i] = sc.nextLine();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
