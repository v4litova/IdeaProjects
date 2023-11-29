package Practice5;

public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle() {
        this.width = 0;
        this.length = 0;
        this.filled = false;
        this.color = "white";
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.filled = false;
        this.color = "white";
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.color = color;
        this.width = width;
        this.length = length;
        this.filled = filled;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override//переопределение
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
    @Override
    public String toString() {
        return "Shape: rectangle, length: " + this.length + ", width: " + this.width + ", color: " + this.color;
    }

}