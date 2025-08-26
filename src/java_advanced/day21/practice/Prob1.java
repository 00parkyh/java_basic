package java_advanced.day21.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person implements Serializable {
    private String name;
    private transient int age;
}

public class Prob1 {
    public static void main(String[] args) throws Exception{
        Person person = new Person("홍길동",30);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.data"))) {
            oos.writeObject(person);

        } catch (Exception e) {
            throw new RuntimeException();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.data"))){

            while (true) {
                System.out.println(ois.readObject());
            }

        } catch (Exception e) {
            System.out.println("끝");
        }
        
    }
}
