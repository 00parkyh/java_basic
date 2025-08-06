package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = {"apple","banana","candy","class","champion","dragon","ear","fire","graphic","hello","ice cream","j-pop",
                "k-pop","lemon","mouth","nice","operate","perfect","quit","raise","study","teacher",
                "umbrella","violin","wow","year","zebra"};


        System.out.print("문자를 입력하세요. ");
        char c = sc.next().charAt(0);
        int count =0;

        for (int i = 0; i<a.length; i++) {
            int index = a[i].indexOf(c);

            if (index ==0) {
                System.out.println(a[i]);
                count ++;
            }
        }
        if (count == 0) {
            System.out.println("찾는 단어가 없습니다.");
        }
    }
}
