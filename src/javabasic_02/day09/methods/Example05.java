package javabasic_02.day09.methods;

import java.util.Scanner;

public class Example05 {
    static Scanner sc = new Scanner(System.in);
    static boolean a = true;
    static int num1, num2,menuNum, result = 0;

    public static void main(String[] args) {
        firstMenu();
        start();
    }

    public  static  void firstMenu() {
        System.out.println("======================================================");
        System.out.println("                     사칙 연산 계산기                    ");
        System.out.println("======================================================");
        System.out.println("1. 덧셈   2. 뺄셈    3. 곱셈    4. 나눗셈   5. 프로그램 종료");
    }

    public static void start() {

        while (a) {
            String inputData = sc.nextLine();
            String [] data = inputData.split(" ");

            if (data.length == 1 && data[0].equals("5")) {
                System.out.println("프로그램을 종료합니다.");
                a = false;
            } else {
                try {
                    if (data.length != 3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    calculator(data);
                }
                catch (ArrayIndexOutOfBoundsException| NumberFormatException e) {
                    System.out.println("두개의 숫자와 메뉴에 있는 번호만 입력해주세요.");
                }
            }
        }
    }

    public static void calculator(String[] data) {
        System.out.println("======================================================");
        System.out.println("                     사칙 연산 계산기                    ");
        System.out.println("======================================================");
        System.out.println("1. 덧셈   2. 뺄셈    3. 곱셈    4. 나눗셈   5. 프로그램 종료");

        num1 = Integer.parseInt(data[0]);
        num2 = Integer.parseInt(data[1]);
        menuNum = Integer.parseInt(data[2]);

        switch (menuNum) {
            case 1: result = num1 + num2; System.out.printf("%d + %d = %d \n",num1, num2,result); break;
            case 2: result = num1 - num2; System.out.printf("%d - %d = %d \n",num1, num2,result); break;
            case 3: result = num1 * num2; System.out.printf("%d * %d = %d \n",num1, num2,result); break;
            case 4: result = num1 / num2; System.out.printf("%d / %d = %.1f \n",num1, num2,(double) result); break;
            default:
                System.out.println("메뉴에 있는 번호만 입력해주세요.");
        }
    }
}
