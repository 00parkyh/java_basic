package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가6_보류 {
    public static void main(String[] args) {
        char[] ch = {'J','U','N','G','O','L'};
        Scanner sc = new Scanner(System.in);
        char a;

        a = sc.next().charAt(0);

        for (int i = 0; i<ch.length; i++){
            if (ch[i] == a) {
                System.out.println(i);
            }
        }

    }
}
