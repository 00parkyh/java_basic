package 선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 < num2 ){
            if (num1<num3) {
                System.out.println(num1);
            } else {
                System.out.println(num3);
            }
        }else if (num2 <num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

    }
}
