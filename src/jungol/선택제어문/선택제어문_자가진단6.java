package 선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sex = sc.next().charAt(0);
        int age = sc.nextInt();


        if (age>20 && sex =='M') {
            System.out.println("MAN");
        } else if (age>20 && sex == 'F') {
            System.out.println("WOMAN");
        } else if (age<20 && sex =='M') {
            System.out.println("BOY");
        }else if (age<20 && sex =='F') {
            System.out.println("GIRL");
        }
    }
}
