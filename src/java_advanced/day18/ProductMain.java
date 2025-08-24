package java_advanced.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductMain {
    public static void main(String[] args) {
        //List<Product> ArrayList products 생성
        List<Product> products = new ArrayList<>();

        //5개의 제품을 생성하여 products 에 저장
        products.add(new Product(1,"지갑","프라다",10000));
        products.add(new Product(2,"신발","크록스",5000));
        products.add(new Product(3,"휴대폰","애플",20000));
        products.add(new Product(4,"에어팟","애플",15000));
        products.add(new Product(5,"텀블러","스타벅스",1000));

        //객체 스트림을 얻어서 각 제품의 정보를 출력하세요.
        Stream<Product> productStream = products.stream();
        productStream.forEach(System.out::println);

    }
}
