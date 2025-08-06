package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[51];
        int count = 0;

        while (true) {
            String b = sc.nextLine();
            if (b.equals("0")) {
                break;
            }
            a[count] = b;
            count++;

        }
        System.out.println(count);
        for (int i = 0; i < count; i+=2) {
            System.out.println(a[i]);
        }
    }
}