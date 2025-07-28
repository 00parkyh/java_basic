package 입력;

import java.util.Scanner;

public class 입력1_자가진단9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1,num2,num3;

        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();

        System.out.printf("%.3f\n",num1);
        System.out.printf("%.3f\n",num2);
        System.out.printf("%.3f",num3);
    }
}
