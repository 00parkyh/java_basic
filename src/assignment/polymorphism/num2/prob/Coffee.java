package assignment.polymorphism.num2.prob;

public class Coffee extends Beverage{
    static int amount;

    Coffee(String name) {
        super(name);
    }

    @Override
    public void calcPrice() {
        if (super.getName().equals("Americano")) {
            super.setPrice(1500);
            amount++;
        } else if (super.getName().equals("CafeLatte")) {
            super.setPrice(2500);
            amount++;
        } else if (super.getName().equals("Cappuccino")) {
            super.setPrice(3000);
            amount++;
        }
    }
}
