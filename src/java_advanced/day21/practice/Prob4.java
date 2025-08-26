package java_advanced.day21.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Account implements Serializable {
    private String owner;
    private transient int balance;

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeInt(balance);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        this.balance = ois.readInt();
    }
}



public class Prob4 {
    public static void main(String[] args) throws Exception {
        Account account = new Account("철수",10000);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("account.txt"))) {
            oos.writeObject(account);

        } catch (Exception e){
            throw new RuntimeException();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("account.txt"))) {

            while (true) {
                System.out.println(ois.readObject());
            }

        } catch (EOFException e){
            System.out.println("end");
        }

    }
}
