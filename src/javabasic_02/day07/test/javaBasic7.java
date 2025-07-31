package javabasic_02.day07.test;

public class javaBasic7 {
    public static void main(String[] args) {
        for (int i =1; i<=3; i++) {
            for (int s = 2; s>=i; s--) {
                System.out.print(" ");
            }
            for (int x = 1; x<=i; x+=2) {
                System.out.print("@");
            }

            System.out.println();
        }

    }
}
