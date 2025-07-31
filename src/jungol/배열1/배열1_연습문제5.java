package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month;
        int[] day = new int[31];

        do {
            System.out.print("YEAR = ");
            year = sc.nextInt();
            System.out.print("MONTH = ");
            month = sc.nextInt();

            if (year % 400 ==0 || (year %4 ==0 && year%100 !=0)) {
                switch (month) {
                    case 1: case 3: case 5:
                    case 7: case 8: case 10:
                    case 12:
                        day = new int[31]; System.out.printf("입력하신 달의 날 수는 %d일입니다. \n",day.length);System.out.println(); break;

                    case 2: day = new int[29]; System.out.printf("입력하신 달의 날 수는 %d일입니다. \n",day.length);System.out.println();break;

                    case 4: case 6:
                    case 9: case 11:
                        day = new int[30]; System.out.printf("입력하신 달의 날 수는 %d일입니다. \n",day.length);System.out.println();break;
                    case 0: break;
                    default:
                        System.out.println("잘못 입력하였습니다. \n");System.out.println();break;
                }
            } else if ( year == 0){
                System.out.printf("MONTH = %d",0);
            } else {
                switch (month) {
                    case 1: case 3: case 5:
                    case 7: case 8: case 10:
                    case 12:
                        day = new int[31];
                        System.out.printf("입력하신 달의 날 수는 %d일입니다. \n",day.length);System.out.println();break;

                    case 2: day = new int[28]; System.out.printf("입력하신 달의 날 수는 %d일입니다. \n",day.length);System.out.println();break;

                    case 4: case 6:
                    case 9: case 11:
                        day = new int[30];System.out.printf("입력하신 달의 날 수는 %d일입니다. \n",day.length);
                        System.out.println();break;

                    default:
                        System.out.println("잘못 입력하였습니다.\n");break;
                }
            }
        } while (year != 0);

    }
}
