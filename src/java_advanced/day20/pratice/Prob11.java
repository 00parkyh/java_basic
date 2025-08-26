package java_advanced.day20.pratice;

import java.io.*;

// 문제 11: 간단한 메모장 (덮어쓰기 모드 vs 이어쓰기 모드)
//       사용자가 입력한 내용을 memo.txt에 저장하는 프로그램을 작성하세요.
//       "append" 모드를 선택하면 기존 내용 뒤에 이어쓰기,
//       "overwrite" 모드를 선택하면 새로 쓰기 기능을 수행합니다.
public class Prob11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream os = new FileOutputStream("keyboard.txt");

        System.out.println("문장을 입력하세요 (exit 입력 시 종료):");
        String line;
        while (!(line = br.readLine()).equals("exit")) {
            os.write(line.getBytes());
            os.write('\n');
        }

        os.close();
        br.close();
        System.out.println("저장 완료!");
    }
}
