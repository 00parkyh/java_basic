package java_advanced.day21.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

@AllArgsConstructor
@Data
@NoArgsConstructor
class Book implements Serializable {
    private String title;
    private int price;
    private static final long serialVersionUID = 10L;
}

public class Prob2 {
    public static void main(String[] args) throws Exception{
        Book book1 = new Book("나혼자만 레벨업",10000);
        Book book2 = new Book("나노마신",20000);
        Book book3 = new Book("외모지상주의",15000);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"))){

            oos.writeObject(books);
        } catch (Exception e) {
            throw new RuntimeException();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.dat"))) {

            while (true) {
                System.out.println(ois.readObject());
            }

        }catch (EOFException e){
            System.out.println("파일 끝");
        }

    }
}
