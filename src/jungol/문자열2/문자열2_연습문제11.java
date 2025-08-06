package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double[] a = new Double[3];
        String[] b = new String[3];
        String c = "";

        for (int i = 0; i<3;i++) {
            a[i] = sc.nextDouble();
        }

        for (int i = 0; i<3;i++) {
            b[i] = String.format("%.2f",a[i]);
        }
        for (int i = 0; i<3; i++) {
            c+=b[i];
        }

        String [] d = c.split("\\.");
        for (int i = 0; i<d.length; i++) {
            System.out.println(d[i]);
        }
    }
}
