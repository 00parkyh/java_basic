package javabasic_02.day09.methods;

import java.util.Scanner;

public class Example04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("사용자의 아이디를 입력해주세요. ");
        String id = sc.nextLine();
        System.out.println("비밀번호를 입력해 주세요. ");
        String pwd = sc.nextLine();
        idPwPrint(id, pwd);

    }

    //사용자가 입력한 아이디와 비밀번호를 idPwPrint()를 이용하여 출력하세요.
    public static void idPwPrint(String id, String pwd) {

        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + pwd);

    }
}
