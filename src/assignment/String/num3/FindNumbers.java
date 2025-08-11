package assignment.String.num3;

import java.util.Arrays;

public class FindNumbers {

	public static void main(String[] args) {
		FindNumbers fn=new FindNumbers();

		long number = 228754462;
		System.out.println( "입력 숫자 = " + number );
		System.out.println("2 횟수 => " + fn.countNumber(number, 2));//3을 리턴
		System.out.println("4 횟수 => " + fn.countNumber(number, 4));//2를 리턴
	}

    /*  이곳에 countNumber 메소드를 작성하십시오. */
    private String countNumber(long number, int i) {
        String strnumber = Long.toString(number);
        int count = 0;
        char stri = (char) ('0' +i);

        for (int s = 0; s<strnumber.length();s++) {
            if (strnumber.charAt(s) == stri) {
                count ++;
            }
        }
        return String.valueOf(count);
    }

}
