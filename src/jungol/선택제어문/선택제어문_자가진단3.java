package 선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        num1 = sc.nextInt();

        if (num1 >= 20) {
            System.out.println("adult");
        } else {
            System.out.printf("%d yesrs later",(20 -num1));
        }
    }
}
