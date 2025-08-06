package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        char[] b = new char[a.length()];

        for (int i = 0; i<a.length();i++) {
            b[i] = a.charAt(i);
            if (Character.isUpperCase(b[i])) {
                b[i] = Character.toLowerCase(b[i]);
            } else if (Character.isLowerCase(b[i])) {
                b[i] = Character.toUpperCase(b[i]);
            }
        }
        for (int i = 0; i<a.length(); i++) {
            System.out.print(b[i]);
        }
    }
}
