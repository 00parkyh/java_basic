package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제7 {
    public static void main(String[] args) {
        String[] a = {"champion", "tel", "pencil", "jungol", "olympiad", "class", "information", "lesson", "book", "lion"};

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("문자를 입력하세요. ");
        char b = sc.nextLine().charAt(0);
        int count =0;
        int count2=0;

        for (int i = 0; i<a.length;i++) {
            if (a[i].indexOf(b)!= -1) {
                System.out.println(a[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("찾는 단어가 없습니다.");
        }

        System.out.print("문자열을 입력하세요. ");
        String c = sc.nextLine();

        for (int i = 0; i<a.length; i++) {
            if (a[i].contains(c)) {
                System.out.println(a[i]);
                count2++;
            }
        }
         if (count2 == 0) {
            System.out.println("찾는 단어가 없습니다.");
        }
     }
}
