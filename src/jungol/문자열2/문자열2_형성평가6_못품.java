package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가6_못품 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d;

        String a = sc.next();
        String b = sc.next();
        int c = sc.nextInt();
        a = a + b;

        d = a.substring(0, c) + b.substring(c);

        System.out.println(a);
        System.out.println(d);
    }
}
