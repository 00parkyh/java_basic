package javabasic_02.test.loop_array;

public class javaBasic7_다시풀기 {
    public static void main(String[] args) {
        for (int i =1; i<=3; i++) {

            for (int s = 2; s>=i; s--) {
                System.out.print(" ");
            }
            for (int x = 1; x<2*i; x++) {
                System.out.print("@");
            }
            System.out.println();
        }
        for (int i = 1; i<=2; i++) {
            for (int x = 1; x<=i; x++) {
                System.out.print(" ");
            }
            for (int s = 5; s>2*i; s--) {
                System.out.print("@");
            }
            System.out.println();
        }

    }
}
