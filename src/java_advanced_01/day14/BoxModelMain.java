package java_advanced_01.day14;

import java.util.ArrayList;

public class BoxModelMain {
    public static void main(String[] args) {
        //철호가 "배추","무","상추","삼겹살"를 구매후 box에 담았다. box에 담긴 내용을 출력
        ArrayList<String> boxModel = new ArrayList<>();
        boxModel.add("배추");
        boxModel.add("무");
        boxModel.add("상추");
        boxModel.add("삼겹살");

        for (String string : boxModel) {
            System.out.println(string);
        }
    }
}
