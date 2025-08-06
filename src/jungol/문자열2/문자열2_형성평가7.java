package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int num1 = Integer.parseInt(a.replaceAll("[^0-9].*",""));
        int num2 = Integer.parseInt(b.replaceAll("[^0-9].*",""));

        System.out.println(num1 * num2);
    }
}
