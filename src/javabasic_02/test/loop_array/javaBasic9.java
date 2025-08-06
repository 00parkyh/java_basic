package javabasic_02.test.loop_array;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class javaBasic9 {
    public static void main(String[] args) {
        boolean a = true;   //while문을 끝내기 위한 변수
        int n = 0;          //입력받는 학생수를 int 형으로 바꾸기 위한 변수
        int sum = 0;        //합계
        Scanner sc = new Scanner(System.in);
        String choice;          //메뉴 번호
        String studentNum;      //학생수
        String point;           //점수
        int[] scores = new int[n];     //학생 수 만큼 점수를 입력하기 위한 배열


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
                    scores = new int[n];
                    break;

                case "2":
                    for (int i = 0; i<n; i++) {
                        System.out.print("scores["+i+"] : ");
                        point = sc.nextLine();
                        scores[i] = Integer.parseInt(point);
                        sum+=scores[i];     //
                    }
                    break;

                case "3":
                    for (int x = 0; x<n; x++) {
                        System.out.println("scores["+x+"] : "+scores[x]);
                    }
                    break;

                case "4":
                    System.out.printf("최고점수: %d \n", Arrays.stream(scores).max().getAsInt());
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
