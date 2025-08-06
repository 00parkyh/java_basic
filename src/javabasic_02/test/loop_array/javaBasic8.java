package javabasic_02.test.loop_array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class javaBasic8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        boolean a = true;
        String cash ;
        int total=0;

        while (a) {
            System.out.println("----------------------------------------");
            System.out.println("1. 예금  |  2. 출금  |  3.잔고  |  4.종료  ");
            System.out.println("----------------------------------------");
            System.out.print("선택> ");

            try{
                num = sc.nextLine();
                switch (num) {
                    case "1":
                        System.out.print("예금액>");
                        cash = sc.nextLine();
                       total = total + Integer.parseInt(cash);
                        break;
                    case "2":
                        System.out.print("출금액>");
                        cash = sc.nextLine();
                        if (total>Integer.parseInt(cash)) {
                            total -= Integer.parseInt(cash);
                        } else {
                            System.out.println("예금이 부족합니다.");
                        }
                        break;
                    case "3":
                        System.out.printf("잔고>%d\n",total); break;
                    case "4":
                        System.out.println("프로그램 종료");
                        a = false;
                        break;

                    default:
                        System.out.println("번호만 입력해주세요> ");
                        break;
                }
            }catch (InputMismatchException e) {
                System.out.println("메뉴에 있는 번호만 입력해주세요");
                sc.nextLine();
            }

        }
    }
}
