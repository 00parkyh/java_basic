package 반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가2 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);

        num1 =sc.nextInt();
        num2 = sc.nextInt();

        if(num1 > num2) {
            for (int i = num2; i<=num1; i++) {
                System.out.print(i + " ");
            }
        } else {
            for(int i = num1; i<=num2; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
