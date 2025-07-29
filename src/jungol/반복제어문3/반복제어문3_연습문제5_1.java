package jungol.반복제어문3;

public class 반복제어문3_연습문제5_1 {
    public static void main(String[] args) {
        for (int i = 1; i<10; i+=2) {
            for (int s =9; s>i ; s-=2 ) {
                System.out.print(" ");
            }
            for (int q = 1; q<=i; q++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
