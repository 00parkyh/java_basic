package java_advanced.day21.serialize;

import java_advanced.day18.filedata.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.security.spec.EdECPoint;
import java.util.Arrays;
import java.util.List;

//자바는 메모리에 생성된 객체를 파일 또는 네트워크로 출력할 수 있다.
// 객체를 입출력할 수 있는 보조 스트림
// ObjectInputStream(바이트 스트림과 연결되어 객체로 복원하는 역직렬화)
// ObjectOutputStream(바이트 스트림과 연결되어 객체를 직렬화)


@Data
@AllArgsConstructor
@NoArgsConstructor
class User implements Serializable {
    private String name;
    private transient int age; //transient 키워드는 직렬화 대상에서 필드를 제외한다.
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Product implements Serializable{
    private String name;
    private int price;
}

public class ObjectInOutEx {
    public static void main(String[] args) throws Exception{
        // C:/Temp/object.dat  에 파일객체에 파일입력 객체를 생성해주세요
        FileOutputStream fos = new FileOutputStream("C:/Temp/object.dat");

        //2. 생성된 파일 입력 스트림 객체에 객체 출력 스트림 객체를 끼워주세요.
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //3. 객체 생성
        User user = new User("신세계",20);
        Product product = new Product("삼성 노트북",1500000);
        int[] arr1 = {10,20,30};
        List<Product> products = Arrays.asList(product);

        //4. 위 4개의 객체를 object.dat 파일에 직렬화하여 저장
        oos.writeObject(products);
        oos.writeObject(arr1);
        oos.writeObject(product);
        oos.writeObject(user);
        //5.
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();

        //파일에서 읽어서 ObjectInputStream
        FileInputStream fis = new FileInputStream("C:/Temp/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
//
//        System.out.println(ois.readObject());
//        System.out.println(ois.readObject());
//        System.out.println(ois.readObject());
//        System.out.println(ois.readObject());
//
//        ois.close();
//        fis.close();
        try {
            while (true) {
                System.out.println(ois.readObject());
            }
        }catch (EOFException e) {
            System.out.println("Exception");
        }finally {
            ois.close();
            fis.close();
        }
    }
}
