package assignment.Stream.num1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "THis is a java bok",
                "Lamda Expressions",
                "Java8 supports lambda expressions"
                );
        list.stream().filter(a -> a.toLowerCase().contains("java")).forEach(System.out::println);
    }
}
