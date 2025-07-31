package javabasic_01.day03;

import java.util.Scanner;

public class PrintEx {
    public static void main(String[] args) {
        //표준 출력 장치인 모니터에 값을 출력하였다.
//        System. + out. + println(리터럴 또는 변수);
//        시스템으로 출력하는데 괄호안의 내용을 출력하고 행을 바꿔라
//        출력 방법에 따라 println(), print(), printf()

        System.out.printf("과목명 : %s \n","자바");
        System.out.printf("과목명 : %1$s 이름 : %2$s \n","자바", "박용헌");
        System.out.printf("과목명 : %1$s 이름 : %2$s 학번 : %3$s","자바", "박용헌","1234\n");

        //정수 123을 printf() 출력하고싶다
        System.out.printf("%d\n",123);

        //정수 ___123을 printf() 출력하고 싶다. 6자리 정수 출력. 왼쪽 빈자리 공백
        System.out.printf("%-6d\n", 123); // -를 붙이면 왼쪽이 아닌 오른쪽으로 공백을 출력하라 가 된다.
        System.out.printf("%6d\n", 123);
        //정수 000123을 printf() 출력하고 싶다. 6자리 정수 출력. 왼쪽 빈자리 공백
        System.out.printf("%06d\n", 123);

        System.out.println("===========실수 표현============");

        //정수 7자리 + 소수점 + 소수 2자리 출력 왼쪽 빈자리 공백 ____123.45
        System.out.printf("%10.2f \n",123.45);
        System.out.printf("%10.2f \n",123.456); // => 소수점 2번째 자리까지 표시라 반올림 되서 나옴

        //정수 7자리 + 소수점 + 소수 2자리, 왼쪽 빈자리 0    0000123.45
        System.out.printf("%010.2f\n",123.45);

        System.out.println("===========문자열 표현============");
        //문자열은 %s 로 포맷      abc 출력
        System.out.printf("%s\n","abc");

        //문자열은 %s 로 포맷   ___abc 출력
        System.out.printf("%6s\n","abc");

        //특수 문자 \t, \n %%
        System.out.printf("소금물의 농도 : %%%d\n",35);

        int price = 5000;
        System.out.printf("상품의 가격: %d원\n",price);
        System.out.printf("상품의 가격: %8d원\n",price);
        System.out.printf("상품의 가격: %08d원\n",price);

        System.out.println("반지름을 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        System.out.printf("반지름이 %d인 원의 넓이 : %.1f",rad,rad*rad*Math.PI);


    }
}
