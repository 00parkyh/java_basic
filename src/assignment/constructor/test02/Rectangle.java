package assignment.constructor.test02;

public class Rectangle {
    int width;
    int length;
    String color;

    public int area() {
        int area = 0;
        area = width * length;
        return area;
    }
    public int perimeter() {
        int perimeter = 0;
        perimeter = width*2 + length*2;
        return perimeter;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
