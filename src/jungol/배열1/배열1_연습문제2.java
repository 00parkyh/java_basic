package jungol.배열1;

public class 배열1_연습문제2 {
    public static void main(String[] args) {
        int a = 65;
        char [] abc = new char[26];

        for (int i = 0; i<26; i++) {
            abc[i] = (char)a;
            a++;
        }

        for (int s = 25; s >=0 ; s--) {
            System.out.print(abc[s] + " ");
        }

    }
}
