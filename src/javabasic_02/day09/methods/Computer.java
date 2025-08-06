package javabasic_02.day09.methods;
//가변길이 매개변수
//메소드를 호출할떄 매개변수의 개수에 맞게 매개값을 제공해야 한다.
//만약 메소드가 가변길이 매개변수를 가지면 매개변수의 개수와 상관 없이 매개값을 줄 수 있다.
public class Computer {
//    static int[] num = new int[5];
//    static int result = 0;

    public int totalSum(int... values) {        //가변길이
        //public void totalSum(int [] a)로 했다 -박용헌
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
//        num[0] = 1;
//        num[1] = 2;
//        num[2] = 3;
//        num[3] = 4;
//        num[4] = 5;
//        num =  new int[]{1,2,3,4,5};
//        System.out.println("1 부터 5까지의 누적 합은 "+result+"입니다.");
    }
}
