package javabasic_02.day07;

import static java.lang.Character.toLowerCase;

public class ArrayTest {
    public static void main(String[] args) {
        int [] a = {10,20,30,40,50};
        int []b ;
        b = new int[] {10,20,30,40,50};

        int firstIndexValue = a[0];
        int threeIndexValue = b[3];
        int result = firstIndexValue +threeIndexValue;
        System.out.println(result);
        char [] c = {'A','P','L','L','E'};

        for(int i = 0; i<c.length; i++) {
            System.out.print(toLowerCase(c[i]));
        }
    }
}
