package java_advanced_01.day16.unmodifable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ImmutableEx {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Orange", "Banana","Pear");
//        list.add("Grape");
        for (String s :list) {
            System.out.println(s);
        }

        Map<String,Integer> map = Map.of("Apple", 10000, "Orange", 2500, "Banana", 30000);
        for (String s:map.keySet()) {
            System.out.println(s);

            System.out.println(map.get(s));
        }
        //배열로부터 수정할 수 없는 List 컬렉션 생성 방법
        String[] arr = new String[]{"Apple", "Orange", "Banana", "Pear"};
        List<String> list2 = List.of(arr);
        List<String> list3 = Arrays.asList(arr);
    }
}
