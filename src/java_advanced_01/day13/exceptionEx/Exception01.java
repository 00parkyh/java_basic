package java_advanced_01.day13.exceptionEx;

import java_advanced_01.day13.B;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//1. IOException : 입(input)출력(output)을 다루는 메소드는 IOException 처리하도록 규정되어있다.
//2. FileNotFoundException :
public class Exception01 {
    public static void main(String[] args) throws IOException {
        byte[] list = {'a','b','c'};

//        try {
//            System.out.write(list);
//        }catch (IOException e) {
//            e.getMessage();
//        } 1번 방법, 2번은 throws IOException 사용

//        System.out.write(list);

        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.getMessage();
        }

    }
}
//예외처리
//1. try-catch
//2. throws 던져서

