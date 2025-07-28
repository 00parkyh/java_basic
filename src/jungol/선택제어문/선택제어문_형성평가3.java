package 선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가3 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (year %400 == 0) {
            System.out.println("leap year");
        } else if ((year % 4) == 0 && (year % 100) !=0) {
            System.out.println("leap year");
        } else System.out.println("common year");

    }
}
