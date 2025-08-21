package java_advanced_01.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineEx {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("홍길동",90));
        students.add(new Student("이종범",80));
        students.add(new Student("양현종",100));

        List<Student> studentList = Arrays.asList(
                new Student("최형우",100),
                new Student("김선빈",60),
                new Student("나성범",30)
        );

//       방법1 스트림 ==> 중간처리 ==> 최종처리 ==> 학생들의 평균 점수
        //스트림 얻기
        Stream<Student> studentStream1 = students.stream();
        //중간처리 (학생 객체를 점수(정수타입)로 매핑)
        IntStream scoreStream = studentStream1.mapToInt(
                student -> student.getScore()
        );
        //최종 처리
        double averageScore = scoreStream.average().getAsDouble();
        System.out.println(averageScore);


//       방법2 람다식을 주입해서 파이프라인 처리 방식
        double averageScore2 = studentList.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();
        System.out.println(averageScore2);

    }
}
