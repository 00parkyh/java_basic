package javabasic_02.test.loop_array;

public class javaBasic6 {
    public static void main(String[] args) {
        for (int i =1; i<=5; i++) {

            for (int s = 5; s>=i; s--) {
                System.out.print(" ");
            }
            for (int x = 1; x<=i;x ++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
