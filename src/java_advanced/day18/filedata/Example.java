package java_advanced.day18.filedata;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동","개발자"),
                new Member("김나리","디자이너"),
                new Member("신용권","개발자")

//                new Member("홍길동",30),
//                new Member("홍길동",40),
//                new Member("김자바",26)
        );

//        double avg = list.stream().mapToInt(Member::getAge).average().getAsDouble();
//        System.out.println(avg);

        List<Member> result = list.stream().filter(m->m.getJob().equals("개발자")).toList();

        result.stream().forEach(m-> System.out.println(m.getName()));
    }
}
