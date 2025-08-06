package jungol.배열1;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_형성평가10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //정수 n 입력받기
        int num = sc.nextInt();
        //입력받은 n 크기 사이즈의 점수를 담을 배열 num1 생성
        int[] num1 = new int[num];
        //입력받은 n 크기 사이즈의 최대값부터 담을 배열 max 생성
        int[] max = new int[num];

        //입력받을 점수를 배열 num1에 담기
        for (int i = 0; i< num; i++){
            num1[i] = sc.nextInt();
        }

        //받은 점수중 최대값을 찾아서 순서대로 max에 담기
//        for (int s = 0; s<num; s++) {
//            max[s] = Arrays.stream(num1).max().getAsInt();
//        } 정렬로 변경
        max = Arrays.stream(num1).sorted().toArray();
        for (int j = num-1; j >=0; j--) {
            System.out.println(max[j]);
        }

    }
}
