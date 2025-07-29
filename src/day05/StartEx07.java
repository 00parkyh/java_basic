package day05;

import java.util.Scanner;

public class StartEx07 {
    public static void main(String[] args) {
        for(int i = 1; i<10;i+=2) {
            for (int s = 9; s>i; s-=2 ) {
                System.out.print(" ");
            }
            for (int q = 1; q<=i;q++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 1; j<=7; j+=2) {
            for (int w = 1; w<=j; w+=2) {
                System.out.print(" ");
            }
            for (int x = 7; x>=j; x--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
