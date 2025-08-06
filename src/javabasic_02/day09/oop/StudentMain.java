package javabasic_02.day09.oop;

public class StudentMain {
    public static void main(String[] args) {
        Student 경민 = new Student();
        Student 우혁 = new Student("강우혁", "12345");
        Student 형근 = new Student("김형근",27,"경기도 의정부시","1235467");
        Student 기웅 = new Student("김형근",25,"서울시 강남구","12354678");

//        System.out.println(경민.toString());
//        System.out.println(우혁.toString());
//        System.out.println(형근.toString());
//        System.out.println(기웅.toString());
//        System.out.println(기웅.getStu_name());
//        System.out.println(기웅.getAddress());
//
//        String 기웅주소 = 기웅.getAddress();
//        System.out.println(기웅주소 + "살고 있습니다. ");
//        기웅.gender = "남자";
//        System.out.println(기웅.gender);

        Student 용헌1 = new Student(80,50,100);

        Integer[] 용헌점수 = 용헌1.getScore();
        for (int i = 0; i<3;i++) {
            System.out.print(용헌점수[i] + " ");
        }
        System.out.println();

        Integer 총점 = 용헌1.getTotalScore();
        System.out.println("총점 : " + 총점);

        Double 평균 = 용헌1.getAvg();
        System.out.printf("평균 : %.2f",평균);

    }
}
