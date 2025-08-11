package assignment.polymorphism.num1.prob;

public class Circle extends Shape {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void calculationArea() {
        if (this.getName().equals("원")) {
            double area = getArea();
            area = radius * Math.PI;
            setArea(area);
        }

    }
}
