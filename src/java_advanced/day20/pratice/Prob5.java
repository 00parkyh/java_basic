package java_advanced.day20.pratice;

import java.io.FileInputStream;
import java.io.InputStream;

// 문제 5: 바이트 단위 파일 읽기
//        byte_output.txt 파일을 읽어 화면에 출력하세요.
public class Prob5 {

    public static void main(String[] args) throws Exception{

        try {
            InputStream is = new FileInputStream("C:/Temp/byte_output.txt");

            byte[] array = new byte[100];

            while (true) {
                int data = is.read(array);
                if (data == -1) break;

                for (int i = 0; i < data; i++) {
                    System.out.print((char) array[i]);
                }
            }
            is.close();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
