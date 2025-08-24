package java_advanced.day19.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        //1. 정수 리스트에서 짝수를 필터링 하는 자바스트림 연산을 작성하세요.
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println(intList.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList()));

        //2. 리스트의 각 정수를 제곱하기 위해 map연산을 사용하여 연산 결과를 출력하세요.
        System.out.println(intList.stream().map(num -> num*num).collect(Collectors.toList()));

        //3. 문자열 리스트에서 중복 요소를 제거하기 위해 distinct 연산을 사용하여 결과를 출력하세요.
        List<String> strList = Arrays.asList("허스키","푸들","사모예드","치와와","토이푸들","닥스훈트","도베르만","푸들","허스키");
        System.out.println(strList.stream().distinct().collect(Collectors.toList()));

        //4. 스트림을 사용하여 정수리스트를 오름차순으로 정렬하세요.
        List<Integer> numList = Arrays.asList(45,511,245,378,40,95,56,78,81,90);
        System.out.println(numList.stream().sorted().collect(Collectors.toList()));

        //5. 정수 리스트에서 리스트의 모든 짝수의 합을 구하여 출력하세요.
        System.out.println(numList.stream().filter(num -> num %2 ==0).mapToInt(num -> num).sum());
    }
}
