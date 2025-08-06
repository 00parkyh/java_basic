package jungol.배열2;

public class 배열2_연습문제3 {
    public static void main(String[] args) {

        int[] a = new int[41];
        a[1] = 1;
        a[2] = 1;
        for (int i = 3; i <= 40; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }

        System.out.println("피보나치 수열 10항 : " + a[10]);
        System.out.println("피보나치 수열 20항 : " + a[20]);
        System.out.println("피보나치 수열 30항 : " + a[30]);
        System.out.println("피보나치 수열 40항 : " + a[40]);
    }
}