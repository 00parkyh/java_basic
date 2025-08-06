package assignment.Inheritance.test01;

public class Alcohol extends Drink {
    double alcper;

    Alcohol(String name, int price, int count, double alcper) {
        super(name,price,count);
        this.alcper = alcper;
    }
    public static void printTitle() {
        System.out.println("상품명(도수[%])\t 단가\t 수량\t 금액\t");
    }
    public void printData() {
        System.out.printf("%s(%.1f)%12d%5d%12d%n", this.name,this.alcper,this.price, this.count, this.price * this.count);
    }

}
