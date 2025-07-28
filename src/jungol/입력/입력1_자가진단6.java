package 입력;

import java.util.Scanner;

public class 입력1_자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;

        System.out.print("height = ");
        height = sc.nextInt();
        System.out.printf("Your height is %dcm.",height);
    }
}
