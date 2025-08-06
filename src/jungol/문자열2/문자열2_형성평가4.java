package jungol.문자열2;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열2_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] b = new String[a];

        for (int i = 0; i < a; i++) {
            b[i] = sc.next();
        }

        Arrays.sort(b);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}
