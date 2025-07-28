package 입력;

import java.util.Scanner;

public class 입력1_자가진단8 {
    public static void main(String[] args) {
        double num1, num2;
        char c ;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        c = sc.next().charAt(0);

        System.out.printf("%.2f \n",num1);
        System.out.printf("%.2f \n",num2);
        System.out.printf("%c",c);

    }
}
