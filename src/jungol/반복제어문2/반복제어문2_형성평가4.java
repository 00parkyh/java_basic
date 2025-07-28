package 반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가4 {
    public static void main(String[] args) {
        int count;
        int sum = 0;
        double avg;
        Scanner sc = new Scanner(System.in) ;
        count = sc.nextInt();
        int [] num = new int[count];

        if (count>0 && count <= 100) {
            for(int i = 0; i<count; i++) {
                num[i] = sc.nextInt();
                sum += num[i] ;
            }
            avg =  (double) sum /count;

            System.out.printf("%.2f",avg);
        }
    }
}
