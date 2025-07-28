package 반복제어문2;

import java.util.stream.IntStream;

public class 반복제어문2_연습문제3_1 {
    public static void main(String[] args) {
        for(int i = 1; i<21; i+=2) {
            System.out.printf("%d ",i);
        }

        for(int i = 1 ; i<=20; i++) {
            if(i%2 == 0) System.out.println(i+ " ");
        }
        System.out.println("================");
        IntStream intStream = IntStream.rangeClosed(1,20);
        intStream.filter(n-> n%2 == 1).forEach(e-> System.out.println(e + " "));
    }
}
