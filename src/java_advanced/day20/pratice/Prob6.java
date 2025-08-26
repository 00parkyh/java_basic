package java_advanced.day20.pratice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// 문제 6: 이미지 복사 (바이트 스트림 활용)
//        image.jpg 파일을 읽어서 copy.jpg 파일로 복사하세요.  image.jpg는 여러분이 지정합니다.
public class Prob6 {

    public static void main(String[] args) throws Exception {
        String originalFile = "C:/Temp/image.jpg";
        String newFileName = "C:/Temp/copy2.jpg";

        InputStream is = new FileInputStream(originalFile);
        OutputStream os = new FileOutputStream(newFileName);


        byte[] buffer = new byte[is.available()]; // 읽은 바이트 수만큼 저장할 저장소 생성

        while (true) {
            int numRead = is.read(buffer);

            if (is.read(buffer) == -1) {break;}

            os.write(buffer, 0, numRead);
        }
//        is.transferTo(os);

        os.flush();
        os.close();
        is.close();

    }
}
