package 반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가6 {
    public static void main(String[] args) {
        int num1, num2;
        int sum = 0;
        double avg = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 < num2 ) {
            for(int i = num1; i<=num2 ; i++) {
                if(i % 3 ==0 || i % 5 ==0 ) {
                    ++count;
                    sum +=i;
                    avg = (double) sum / count;
                }
            }
        } else {
            for(int i = num2; i<=num1 ; i++) {
                if(i % 3 ==0 || i % 5 ==0 ) {
                    ++count;
                    sum +=i;
                    avg = (double) sum / count;
                }
            }

        }


        System.out.printf("sum : %d\n",sum);
        System.out.printf("avg : %.1f",avg);
    }
}
