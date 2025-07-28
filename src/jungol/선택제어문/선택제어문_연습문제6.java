package 선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제6 {
    public static void main(String[] args) {

        //Math.max()를 이용하여 풀어보세요
        Scanner sc = new Scanner(System.in);

        System.out.print("세 수를 입력하세요. ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

//        if (num1 > num2 ) {
//            if (num1 > num3) {
//                System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", num1);
//            } else System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", num3);
//        } else if (num2 > num3) {
//            System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", num2);
//        } else System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", num3);

        int temp1 = Math.max(num1,num2);
        int temp2 = Math.max(num2,num3);

        int maxValue = Math.max(temp1,temp2);

        System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.",maxValue);
    }
}
