import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        // 3개의 정수를 입력받아 3개의 정수의 합을 출력하세요
        int num1, num2, num3, sum; // 정수형 변수 선언

        //사용자의 입력을 위한 입력 기능 추가
        Scanner input = new Scanner(System.in);

        //각 변수에 값을 할당
        System.out.print("첫번째 숫자를 입력하세요 : ");
        num1 = input.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        num2 = input.nextInt();
        System.out.print("세번째 숫자를 입력하세요 : ");
        num3 = input.nextInt();

        //연산
        sum = num1 + num2 + num3;
        System.out.println("출력 결과는 다음과 같습니다. : ");

        //출력
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
        System.out.printf("%d + %d + %d = %d",num1,num2,num3,sum);
        

    }
}
