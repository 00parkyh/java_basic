package javabasic_02.day11.inheritance.qa;

public class Son extends Father{
    public void name(String str) {
        System.out.println("나의 이름은 "+str);
    }
    public void printDetails(String str1,String str2,String str3) {
        name(str1);
        familyName(str2);
        houseAddress(str3);
    }
    static Son objSon = new Son();

    public static void main(String[] args) {
        objSon.printDetails("홍길동","프로그래머","인천");
    }
}
