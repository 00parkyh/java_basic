package java_advanced_01.day17.AnonymousClass.lambdaEx;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alic","Amil","Bob","Charlie","David");
        List<String> filteringNames = names.stream()
                .filter(name->name.startsWith("A"))
                .collect(Collectors.toList());

        //A로 시작하는 이름이 하나씩 출력
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println(name));


        System.out.println(filteringNames);

        UnaryOperator<Integer> square = x -> x*x;
        BiFunction<Integer,Integer,Integer> add = (a, b)-> a+b ;

        Runnable run = ()-> System.out.println("hello!!");

        System.out.println(square.apply(5));
        System.out.println(add.apply(1,2));
        run.run();
    }
}
