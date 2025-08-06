package assignment.constructor.test01;

public class Rectangle {
    private int width;
    private int height;
    private String color;
    private int area;

    Rectangle(int width,int height,String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    Rectangle(int width,int height) {
        this.width = width;
        this.height = height;
        this.color = "흰색";
    }
    Rectangle() {

    }
    public void calculateArea() {
        this.area = getWidth() * getHeight();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
