package javabasic_02.day11.inheritance.qa;

public class SubSon extends SubFather{
    public void printSon() {
        System.out.println("나는 아들입니다.");
    }
    static SubSon objSon = new SubSon();

    public static void main(String[] args) {
        objSon.printGrandFather();
        objSon.printGrandFather();
//        objSon.houseAddress;
        objSon.printFather();
        objSon.printSon();
    }
}
