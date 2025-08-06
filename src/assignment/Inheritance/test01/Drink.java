package assignment.Inheritance.test01;

public class Drink {
    String name;
    int price;
    int count;

    Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice() {
        int totalprice =0;
        totalprice= price * count;
        return totalprice;
    }
    public static void printTitle() {
        System.out.printf("%-8s%3s%10s%6s%n", "상품명", "단가", "수량", "금액");
    }
    public void printData() {
        System.out.printf("%-8s%6d%8d%10d%n", this.name, this.price, this.count, this.price * this.count);
    }
}
