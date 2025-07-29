package jungol.반복제어문3;

public class Main {
    public static void main(String[] args) {
        int count=1;
        int Asc = 97; //a 아스키 코드값 97

        for (int i=1; i<=4; i++) {

            for (int x = 1; x<=i;x++ ) {
                System.out.print((char) Asc + " ");
                Asc++;
                for (int w = 1; w<=x; w++) {
                    System.out.print(count + " ");
                    count++;
                }
            }
            System.out.println();
        }

    }
}
