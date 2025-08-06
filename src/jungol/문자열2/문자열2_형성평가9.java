package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int    a = sc.nextInt();
        double b = sc.nextDouble();
        String c = sc.next();

        String d = String.format("%.3f", b);

        String e = a + d + c;

        // 4) 길이를 반으로 나누되, 홀수면 앞쪽이 1글자 더 많게
        int f  = e.length();
        int g = (f % 2 == 0) ? (f / 2) : (f / 2 + 1);

        // 5) 분할해서 출력
        System.out.println(e.substring(0, g));
        System.out.println(e.substring(g));
    }
}
