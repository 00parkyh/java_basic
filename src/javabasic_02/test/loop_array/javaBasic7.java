package javabasic_02.test.loop_array;

public class javaBasic7 {
    public static void main(String[] args) {
        for (int i =1; i<=3; i++) {

            for (int s = 2; s>=i; s--) {
                System.out.print(" ");
            }
            for (int x = 1; x<=5; x+=2) {
                System.out.print("@");
            }
            System.out.println();
        }

    }
}
