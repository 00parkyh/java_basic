package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = {"flower", "rose", "lily", "daffodil", "azalea"};
        int count = 0;
        char b = sc.nextLine().charAt(0);
        for (int i = 0; i<a.length; i++) {
            if (a[i].charAt(1) == b || a[i].charAt(2) == b) {
                System.out.println(a[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}
