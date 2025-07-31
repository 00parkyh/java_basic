package javabasic_02.test.loop_array;

import javax.swing.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class javaBasic9 {
    public static void main(String[] args) {
        boolean a = true;
        String choice;
        Scanner sc = new Scanner(System.in);
        String studentNum;
        int n = 0;
        int[] student = new int[n];
        String point;
        int sum = 0;

        while (a) {
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택> ");
            choice = sc.nextLine();

            try{
            switch (choice) {

                case "1":
                    System.out.print("학생수> ");
                    studentNum = sc.nextLine();
                    n =Integer.parseInt(studentNum);
                    student = new int[n];
                    break;

                case "2":
                    for (int i = 0; i<n; i++) {
                        System.out.print("scores["+i+"] : ");
                        point = sc.nextLine();
                        student[i] = Integer.parseInt(point);
                        sum+=student[i];
                    }
                    break;

                case "3":
                    for (int x = 0; x<n; x++) {
                        System.out.println("scores["+x+"] : "+student[x]);
                    }
                    break;
                case "4":
                    System.out.printf("최고점수: %d \n", Arrays.stream(student).max().getAsInt());
                    System.out.printf("평균점수: %.1f\n",(double)sum/n);
                    break;

                case "5":
                    System.out.println("프로그램 종료");
                    a = false;
                    break;
                default:
                    System.out.println("메뉴에 있는 번호만 눌러주세요. ");
                    break;
            }
            }catch (InputMismatchException e) {
                System.out.println("메뉴에 있는 번호만 입력해주세요. ");
                sc.nextLine();
            }

        }
    }
}
