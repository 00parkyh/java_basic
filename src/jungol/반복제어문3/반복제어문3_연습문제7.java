package jungol.반복제어문3;

public class 반복제어문3_연습문제7 {
    public static void main(String[] args) {
        int count=1;
        int Asc = 97; //a 아스키 코드값 97
        int row = 4;

        for (int i=1; i<=4; i++) {

            for (int x = 1; x<=i;x++ ) {
                System.out.print((char) Asc + " ");
                Asc++;
                }
            for (int w = 1; w<=row-i+1; w++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

    }
}
