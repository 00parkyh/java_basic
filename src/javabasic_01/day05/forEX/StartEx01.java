package javabasic_01.day05.forEX;

public class StartEx01 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("(%d , %d)",i,j);
            }
            System.out.println();
        }
    }
}
