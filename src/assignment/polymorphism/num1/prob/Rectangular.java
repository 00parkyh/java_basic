package assignment.polymorphism.num1.prob;

public class Rectangular extends Shape {
    private double width;
    private double hight;

    public Rectangular(String name,double width, double hight) {
        super(name);
        this.width = width;
        this.hight = hight;
    }

    @Override
    public void calculationArea() {
        if (this.getName().equals("직사각형")) {
            double area = getArea();
            area = this.width * this.hight;
            setArea(area);
        }

    }
}
