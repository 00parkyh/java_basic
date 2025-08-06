package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] c = a.split(" ");
        int num = c[0].compareTo(c[1]);
        if (num<0) {
            System.out.println(c[1]+" 가(이) 더 큽니다.");
        } else if (num>0){
            System.out.println(c[0]+" 가(이) 더 큽니다.");
        }
        if (c[0].substring(0,3).equals(c[1].substring(0,3))) {
            System.out.println("앞의 세 문자가 같습니다. ");
        }else {
            System.out.println("앞의 세 문자가 같지 않습니다.");
        }
    }
}
