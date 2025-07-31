package jungol.배열1;

import java.util.Scanner;

public class 배열1_자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char [] ch = new char [10];

        for (int i = 0; i<10; i++) {
            ch[i] = sc.next().charAt(0);
        }
        for (int s = 0; s<10; s++) {
            System.out.print(ch[s]);
        }
    }
}
