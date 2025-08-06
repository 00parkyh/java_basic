package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a;
        int rage1;

        while (true) {
//            Character.isLowerCase(); => 소문자인 경우
//            Character.isUpperCase(); => 대문자인 경우
            //숫자인것도 구분 가능
            a = sc.next().charAt(0);
            rage1 = (int) a;
            if (rage1>=97 && rage1<=122 ) {
                System.out.println("소문자입니다.");
            } else if (rage1>=65 && rage1<=90) {
                System.out.println("대문자입니다.");
            } else if(rage1>=48 && rage1<=57) {
                System.out.println("숫자문자입니다.");
            } else {
                System.out.println("영문, 숫자 이외의 문자입니다.");
                break;
            }
        }
    }
}
