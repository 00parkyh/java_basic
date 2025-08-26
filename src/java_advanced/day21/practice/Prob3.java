package java_advanced.day21.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
class Student implements Serializable {
    private String name;
    private int grade;
}

public class Prob3 {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("홍길동",4);
        Student s2 = new Student("이순신",3);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))){
            oos.writeObject(s1);
            oos.writeObject(s2);

        } catch (Exception e){
            throw new RuntimeException();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"))) {
            while (true){
                Student reads1 = (Student) ois.readObject();
                Student reads2 = (Student) ois.readObject();

                System.out.println(reads1);
                System.out.println(reads2);
            }
        }catch (EOFException e){
            System.out.println("끝");
        }




    }
}
