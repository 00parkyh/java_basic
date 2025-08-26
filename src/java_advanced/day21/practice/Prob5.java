package java_advanced.day21.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Product implements Serializable{
    private String name;
    private int price;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Order implements Serializable {
    private int orderId;
    private Product product;
}

public class Prob5 {
    public static void main(String[] args) throws Exception {
        Product product = new Product("에어팟", 35000);
        Order order = new Order(10,product);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("order.dat"))) {

            oos.writeObject(order);

        }catch (Exception e){
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("order.dat"))){

            while (true){
                System.out.println(ois.readObject());
            }

        } catch (EOFException e) {
            System.out.println("END");
        }

    }
}
