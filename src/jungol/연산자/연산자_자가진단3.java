package jungol.연산자;

import java.util.Scanner;

public class 연산자_자가진단3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.printf("%d\n",num1++);
        System.out.printf("%d",++num1);
    }
}
