package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] a = new String[5];
        char b ;
        String c;
        int count = 0;
        for (int i = 0; i<a.length; i++) {
            a[i] = sc.nextLine();
        }
        b = sc.nextLine().charAt(0);
        c = sc.nextLine();

        boolean f = false;
        for (int i = 0; i < a.length; i++) {
            String d = a[i];
            if (d.indexOf(b) >= 0 || d.contains(c)) {
                System.out.println(d);
                f = true;
            }
        }
        if (!f) {
            System.out.println("none");
        }
    }
}
