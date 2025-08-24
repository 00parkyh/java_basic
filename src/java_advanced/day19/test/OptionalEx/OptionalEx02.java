package java_advanced.day19.test.OptionalEx;

import java.util.Optional;

public class OptionalEx02 {
    public static void main(String[] args) {
        String str = "Hello Optional"; // str null 값이 아닌 문자열을 할당
        Optional<String> optStr = Optional.of(str);
        System.out.println(optStr); //of()메소드를 통해 값이 null이 아닌경우에만 Optional 객체생성

        String nullstr = null;
        Optional<String> optNullstr = Optional.ofNullable(nullstr);
        System.out.println(optNullstr);

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);
    }
}
