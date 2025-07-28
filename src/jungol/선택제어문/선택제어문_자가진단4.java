package 선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();

        if (num1 <=50.80) System.out.println("Flyweight");
        if (num1 <= 61.23 && num1 >50.80) System.out.println("Lightweight");
        if (num1 <= 72.57 && num1 >61.23) System.out.println("Middleweight");
        if (num1 <= 88.45 && num1 >72.57) System.out.println("Cruiserweight");
        if (num1 > 88.45) System.out.println("Heavyweight");

    }
}
