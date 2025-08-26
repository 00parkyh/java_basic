package java_advanced.day20.pratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

// 문제 7: 파일 크기 출력
//        copy.jpg 파일의 크기를 바이트 단위로 출력하세요.
public class Prob7 {

    public static void main(String[] args) throws Exception {

        String filePath = "C:/Temp/copy2.jpg";
        File file = new File(filePath);

        long fileSize = file.length();
        System.out.println("파일 크기: " + fileSize + " bytes");

    }
}
