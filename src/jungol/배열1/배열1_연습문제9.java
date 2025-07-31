package jungol.배열1;

import java.util.Arrays;

public class 배열1_연습문제9 {
    public static void main(String[] args) {
        int[] num = {95,75,85,100,50};
        int[] num2 = new int[5];

        for (int i = 4; i>=0; i-- ) {
            num2[i] = Arrays.stream(num).max().getAsInt();

            for (int j = 0; j<5; j++) {
                if (num[j] == Arrays.stream(num).max().getAsInt()) {
                    num[j] =0;
                    break;
                }
            }
        }
       for (int s = 0; s<5; s++) {
           System.out.print(num2[s] + " ");
       }

    }
}
