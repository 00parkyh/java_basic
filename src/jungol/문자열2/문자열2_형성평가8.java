package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String a = sc.next();
            if (a.equals("END")) {
                break;
            }

            StringBuilder b = new StringBuilder(a);
            System.out.println(b.reverse().toString());
        }

    }
}