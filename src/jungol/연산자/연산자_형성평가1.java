package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가1 {
    public static void main(String[] args) {
        int kor, eng, math, cm, sum, avg ;

        Scanner sc = new Scanner(System.in);

        kor  =sc.nextInt();
        eng  =sc.nextInt();
        math  =sc.nextInt();
        cm  =sc.nextInt();

        sum = kor + eng + math + cm;

        avg = (int)sum/4 ;
        System.out.printf("sum %d\n", sum);
        System.out.printf("avg %d\n", avg);


    }
}
