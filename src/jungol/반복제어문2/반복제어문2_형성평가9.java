package 반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i =1; i<=num; i++) {
            for(int s = 1; s<=num; s++) {
                System.out.printf("(%d, %d) ", i,s);
                if (s == num) {
                    System.out.println();
                }
            }
        }

    }
}
