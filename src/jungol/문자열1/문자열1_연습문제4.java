package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a ;

        a = sc.nextLine();
        char[] b = new char[a.length()];

        for (int i = 0; i<a.length();i++) {
            char c = a.charAt(i);
            b[i] = c;
        }

        System.out.printf("입력받은 문자열의 길이는 %d입니다.\n",a.length());
        for (int i = a.length()-1; i>=0;i--) {
            System.out.print(b[i]);
        }

    }
}
