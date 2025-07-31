package javabasic_02.test.loop_array;

public class javaBasci3 {
    public static void main(String[] args) {
        int num1,num2;
        boolean a = true;

        while (a) {
            num1  = (int)(Math.random()*6)+1;
            num2  = (int)(Math.random()*6)+1;

            if (num1 + num2 == 5) {
                a = false;
            } else {
                System.out.println(num1);
                System.out.println(num2);
            }
        }
    }
}
