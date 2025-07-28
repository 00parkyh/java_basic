package 선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가4 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number? ");
        num = sc.nextInt();
        if(num == 1) {
            System.out.println("dog");
        } else if (num == 2) {
            System.out.println("cat");
        } else if (num == 3) {
            System.out.println("chick");
        } else System.out.println("I don't know.");

    }
}
