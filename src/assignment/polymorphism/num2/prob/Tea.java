package assignment.polymorphism.num2.prob;

public class Tea extends Beverage{
    static int amount;

    Tea(String name){
        super(name);
    }
    @Override
    public void calcPrice() {
        if (super.getName().equals("lemonTea")) {
            setPrice(1500);
            amount++;
        } else if (super.getName().equals("ginsengTea")) {
            super.setPrice(2000);
            amount++;
        } else if (super.getName().equals("redginsengTea")) {
            super.setPrice(2500);
            amount++;
        }
    }

}
