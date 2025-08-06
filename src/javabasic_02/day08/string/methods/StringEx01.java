package javabasic_02.day08.string.methods;

public class StringEx01 {
    public static void main(String[] args) {

        //1. 문자열에서 원하는 위치의 문자 추출 charAt();
        String subject = "자바객체프로그래밍";
        char charValue = subject.charAt(0);
        System.out.println(charValue);

        String ssn = "9508213456123";
        char gender = ssn.charAt(6);

        switch (gender) {
            case '1': case '3' :
                System.out.println("남성"); break;
            case '2' : case '4' :
                System.out.println("여성");
                break;
        }

        //2. 문자열 길이가 필요할때 length()
        int length = ssn.length();
        System.out.println(length);

        //3. 문자열 대체 기능 : replace("원본 문자열", "바꾸고싶은 문자열")
        String oldStr = "신세계 자바 과정";
        //oldStr의 문자열을 "자바" "자바 벡앤드" 변경 요청
        String newStr = oldStr.replace("자바","자바 벡앤드");
        System.out.println(oldStr);
        System.out.println(newStr);

        //4. 문자열 잘라내기 : substring(int beginIndex), substring(int beginIndex, int endIndex)

        String ss1 ="880815-1234567";
        // - 기준으로 앞숫자 문자열과 뒷숫자를 분리하여 각각 출력하세요

        String firstNum = ss1.substring(0,6);
        System.out.println(firstNum);
        String secondNum = ss1.substring(7,14);
        System.out.println(secondNum);

        //5. 문자열 찾기 : 문자열에서 특정 문자의 위치 찾을때 indexOf()
        int index = subject.indexOf("프로그래밍");

        if(index == -1) System.out.println("포함되어 있지 있다.");
        else System.out.println("포함되어 있다.");
        System.out.println(index);

        //6. 문자열이 포함여부 확인 : contains()
        boolean result = subject.contains("프로그래밍");
        System.out.println(result);

        //7. **********문자열 분리 : split() 여러개의 문자열로 구성시 , 이를 따로 분리해서 문자열을 처리한다. 구분자 (delimiter)를 이용
        String board ="번호,제목,내용,성명";
        String[] boardStr = board.split(",");
        System.out.println(boardStr[0]);
        System.out.println(boardStr[1]);
        System.out.println(boardStr[2]);
        System.out.println(boardStr[3]);

        for (int i = 0; i < boardStr.length; i++) {
            String string = boardStr[i];
            System.out.print(string + " ");
        }

        for (String string : boardStr) {
            System.out.print(string + " ");
        }

    }
}
