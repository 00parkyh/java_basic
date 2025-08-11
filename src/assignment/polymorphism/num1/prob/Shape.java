package assignment.polymorphism.num1.prob;

public abstract class Shape {
    private double area;
    private String name;

    Shape(){}

    Shape(String name) {
        this.name = name;
    }

    public abstract void calculationArea();

    void print() {
        System.out.println(this.name+"의 면적은 "+this.area);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
