package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가3 {
    public static void main(String[] args) {
        int a ,b;
        Scanner sc = new Scanner(System.in);

         a = sc.nextInt();
         b = sc.nextInt();

         a+= 5;
         b *=2;

        System.out.println("width = "+a);
        System.out.println("length = "+b);
        System.out.println("area = "+a*b);

    }
}
