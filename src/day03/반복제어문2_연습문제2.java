package day03;

public class 반복제어문2_연습문제2 {
    public static void main(String[] args) {

        int ch = 65;

        for(int i=1; i<27;i++) {

            System.out.printf("%c \n",ch);
            ch = ch +1;

        }

//        for(int i = 65; i<93 ;i ++) {
//
//        }

        int sum = 0;
        for (int i = 1; i<101;i++) {
            sum = sum+i;
        }
        System.out.println(sum);

    }
}
