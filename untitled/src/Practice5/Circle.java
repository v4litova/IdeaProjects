package Practice5;

public class Circle extends Shape {//extends - на основе существующего класса (суперкласса) создается новый класс
    protected double radius;

    public Circle() {
        this.filled = false;
        this.color = "white";
        radius = 1;
    }
    public Circle(double radius) {
        this.filled = false;
        this.color = "white";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.color = color;
        this.radius = radius;
        this.filled = filled;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override//переопределение
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }

}
