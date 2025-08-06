package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] a = sc.nextLine().split(" ");
        String [] b = sc.nextLine().split(" ");

        int sum  = Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
        System.out.println(a[0]+" + "+ a[1] + " = " +sum);
        double sum1 = Double.parseDouble(b[0]) + Double.parseDouble(b[1]);
        System.out.printf("%.2f + %.2f = %.2f",Double.parseDouble(b[0]),Double.parseDouble(b[1]),sum1);
    }
}
