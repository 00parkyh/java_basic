package 선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. ");
        int score = sc.nextInt();

        switch (score/10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:     //5 이하 부터는 어차피 F 이기 때문에 default로 처리해도 된다.
            case 4:     // default는 위의 case에 모두 해당하지 않을때 실행되는 코드이다.
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("F");
                break;
        }
    }
}
