package 반복제어문2;

import java.util.Scanner;

public class 반복제어문_형성평가8_다시풀기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i = 1; i<=row ; i++) {
            for(int s = 1; s<= col; s++) {
                System.out.print(i*s + " ");
            }
            System.out.println();
        }

    }
}
