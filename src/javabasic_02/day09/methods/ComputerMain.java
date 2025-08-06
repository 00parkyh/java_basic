package javabasic_02.day09.methods;

public class ComputerMain {
    public static void main(String[] args) {
        //Computer 객체 생성
        Computer cm = new Computer();
        int result = 0;
        result = cm.totalSum(1,2,3);
        System.out.println(result);
        result = cm.totalSum(1,2,3,4,5);
        System.out.println(result);

        int[] values = {1,2,3,4,5};
        result = cm.totalSum(values);
        System.out.println(result);

        result = cm.totalSum(new int[] {1,2,3,4,5,6,7,8,9,10});
        System.out.println(result);

    }
}
