package java_advanced.day13.exceptionEx;

import java.util.Scanner;

public class RuntimeErrorEx {

    public static void main(String[] args) {
        int array[] = {10,20,30};
        System.out.println(array[2]);           //ArrayOutofBoundException
//        System.out.println(12/0);             ArithmeticException
        String str = null;
//        System.out.println(str.length());     NullPointException
        // 정수가 아닌 문자열을 정수로 변환할때 예외 발생 : NumberFormatException
        String stringNumber = "3.1415928238";
//        int number = Integer.parseInt(stringNumber);
        double number = Double.parseDouble(stringNumber);
//       or   Float number = Float.parseFloat(stringNumber);
        System.out.println(number);

        //ClassCastException :타입변환은 상위클래스와 하위 클래스 간의 상속, 인터페이스 캐스팅
        Integer num = 30;
        Object x = num;
//        System.out.println((String) x); 오류 발생
        System.out.println(x);
        //InputMismatchException
        //의도치 않은 입력 오류가 발생할때 예외

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요.");

        int num1 = sc.nextInt();
        sc.close();

    }
}
//예외 처리는 subclass => superclass 확장하며 처리하는 것이 원칙이다.
