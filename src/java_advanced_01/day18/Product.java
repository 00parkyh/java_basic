package java_advanced_01.day18;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    //제품은 제품번호, 제품이름, 제조사, 가격이란 속성을 가지고 있다.
    private int no;
    private String name;
    private String company;
    private int price;

    //Setter, Getter toString 오버라이딩
    //@Data

    //제품 생성시 모든 속성의 값을 할당하여 제품을 생산합니다.
    //@AllArgsConstructor
}
