package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가5 {
    public static void main(String[] args) {
        int m_h, m_w, y_h, y_w;
        Scanner sc = new Scanner(System.in);

        m_h = sc.nextInt();
        m_w = sc.nextInt();
        y_h = sc.nextInt();
        y_w = sc.nextInt();

        System.out.println( (m_h > y_h && m_w > y_w ? 1:0));
    }
}
