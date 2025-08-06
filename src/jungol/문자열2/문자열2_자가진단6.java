package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a  = sc.nextLine();
        String [] b = a.split(" ");

        System.out.println(b[0].substring(0,2)+b[1].substring(2)+b[0].substring(0,2));

    }
}
