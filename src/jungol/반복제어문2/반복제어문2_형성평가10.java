package 반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1>=2 && num1 <=9 && num2 >=2 && num2 <=9) {
            if(num1 > num2) {
                for(int i = 1; i <=9 ;i++) {
                    for (int s = num1; s >= num2; s--) {
                        System.out.printf("%d * %d = %2d   ",s,i,i*s);
                    }
                    System.out.println();
                }
            }else{
                for(int i = 1; i <=9 ;i++) {
                    for (int s = num1; s <= num2; s++) {
                        System.out.printf("%d * %d = %2d   ",s,i,i*s);
                    }
                    System.out.println();
                }
            }
        }
    }
}
