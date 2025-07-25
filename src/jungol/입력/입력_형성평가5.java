package jungol.입력;

import java.util.Scanner;

public class 입력_형성평가5 {
    public static void main(String[] args) {
        double yard;
        double cm = 91.44;

        Scanner sc = new Scanner(System.in);
        System.out.print("yard? ");
        yard = sc.nextDouble();
        System.out.printf("%.1fyard = %.1fcm",yard,(yard*cm));

    }
}
