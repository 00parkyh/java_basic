package 반복제어문1;

public class 반복제어문1_연습문제2 {
    public static void main(String[] args) {
        int num =1;
        int sum = 0;

        while (num<11) {
            sum = sum+ num ;
            num+=1;
        }
        System.out.println("1부터 10까지의 합 = " + sum);
        System.out.println("while문이 끝난 후의 num의 값 = " + num);
    }
}
