package java_advanced.day20.pratice;

import java.io.FileOutputStream;
import java.io.OutputStream;

// 문제 4: 바이트 단위 파일 쓰기
//         byte_output.txt 파일에 "ABCDEF"를 바이트 단위로 저장하고 성공하면 "저장완료"  출력하세요
public class Prob4 {

    public static void main(String[] args) throws Exception {

        try{
            OutputStream os = new FileOutputStream("C:/Temp/byte_output.txt");

            byte char1 = 'A';
            byte char2 = 'B';
            byte char3 = 'C';
            byte char4 = 'D';
            byte char5 = 'E';
            byte char6 = 'F';

            os.write(char1);
            os.write(char2);
            os.write(char3);
            os.write(char4);
            os.write(char5);
            os.write(char6);

            os.flush();
            os.close();

            System.out.println("저장 완료!");
        } catch (Exception e ) {
            System.out.println("Exception");
        }

    }
}
