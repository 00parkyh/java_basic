package 선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        int n = (int)(num1);

        switch (n) {
            case 4: System.out.println("scholarship");break;
            case 3: System.out.println("next semester");break;
            case 2: System.out.println("seasonal semester");break;
            case 1:
            case 0: System.out.println("retake");break;
        }
    }
}
