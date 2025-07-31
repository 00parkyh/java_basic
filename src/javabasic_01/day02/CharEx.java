package javabasic_01.day02;

public class CharEx {
    public static void main (String[] args) {
        char c1 = 'A';
        System.out.println(c1);
        char c2 =65;
        System.out.println(c2);
        char c3 = ' ';
        System.out.println(c3);     //char 문제 데이터 초기화 공백의 유니코드 값 32로 한다. '' 안되고 빈(empty) 공간을 만들어 줘야 한다 ' ' 처럼

        char c4 = '가';
        char c5 = 44032;        //'가'의 유니코드 값
        System.out.println(c4);
        System.out.println(c5);

        String v1 = "A";

        char dat[] = {'a','b','c'};

    }
}
