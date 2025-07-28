package 선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b) {
            System.out.println( a - b);
        } else System.out.println( b -a);
    }
}
