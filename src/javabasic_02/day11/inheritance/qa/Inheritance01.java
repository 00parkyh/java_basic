package javabasic_02.day11.inheritance.qa;

import java.util.Scanner;

public class Inheritance01 extends Calculation{
    static Scanner sc = new Scanner(System.in);
    static int num1,num2 =0;

    public static void main(String[] args) {

        System.out.println("숫자를 입력하세요. ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        Inheritance01 obj = new Inheritance01();
        obj.addition(num1,num2);
        obj.Subtraction(num1,num2);
        obj.multiplication(num1,num2);

    }
    public void multiplication(int a, int b) {
        int result = a*b;
        System.out.println("두 수의 곱셈 : "+result);
    }
}
