package java_advanced.day20.pratice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;

// 문제 3: 텍스트 파일에 저장된 문자 수 세기
//         hello.txt 파일의 문자 수를 세어 화면에 출력하세요.
public class Prob3 {

    public static void main(String[] args) throws Exception{

        Reader reader = new FileReader("C:/Temp/hello.txt");
        int charcount = 0;
        while (true) {
            int data = reader.read();
            if (data == -1) break;
            charcount++;
        }
        reader.close();
        System.out.println(charcount);

    }
}
