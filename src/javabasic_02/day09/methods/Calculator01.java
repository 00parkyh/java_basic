package javabasic_02.day09.methods;

import java.util.Scanner;

public class Calculator01 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        //사용자에게 한 줄로 원하는 데이터를 입력받기 5 2 1
        String inputData = in.nextLine();
        int [] fixData = inputDataPro(inputData);
        adder(fixData);
        minus(fixData);
        multi(fixData);
        div(fixData);
    }

    public static int[] inputDataPro(String inputData) {
        String[] splitdat = inputData.split(" ");
        int dat1 = Integer.parseInt(splitdat[0]);
        int dat2 = Integer.parseInt(splitdat[1]);
        int dat3 = Integer.parseInt(splitdat[2]);

        int[] datas = new int[] {dat1,dat2,dat3};

        return datas;
    }
    //menu 기능
    public  static void menu() {
        System.out.println("======================================================");
        System.out.println("                     사칙 연산 계산기                    ");
        System.out.println("======================================================");
        System.out.println("1. 덧셈   2. 뺄셈    3. 곱셈    4. 나눗셈   5. 프로그램 종료");
    }

    public static void adder(int[] datas) {
        int n1, n2, result = 0;
        n1 = datas[0];
        n2 = datas[1];
        result = n1 + n2;
        System.out.println(result);

    }

    public static void minus(int[] datas) {
        int n1, n2, result = 0;
        n1 = datas[0];
        n2 = datas[1];
        result = n1 - n2;
        System.out.println(result);

    }

    public static void multi(int[] datas) {
        int n1, n2, result = 0;
        n1 = datas[0];
        n2 = datas[1];
        result = n1 * n2;
        System.out.println(result);

    }

    public static void div(int[] datas) {
        int n1, n2, result = 0;
        n1 = datas[0];
        n2 = datas[1];
        try {
            result = n1 / n2;
            System.out.println((double) result);
        } catch (Exception e) {
            System.out.println("0으로 나누기 없기!");
        }
    }

}
