package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가2 {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        num =sc.nextInt();

        if (num>0&& num<=100) {
            for (int i = 1;i<=10; i++) {

                if (i*num >=100){
                    break;
                } else if (i*num % 10 == 0) {
                    System.out.print(i*num + " ");
                    break;
                }
                System.out.print(i*num + " ");
            }
        } else {
            System.out.println("0에서 100 사이의 정수를 입력하세요.");
        }
    }
}
