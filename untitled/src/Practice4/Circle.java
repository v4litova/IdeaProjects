package Practice4;

public class Circle {
    private float radius;
    //Конструктор класса
    public Circle(float r) {
        radius=r;
    }
    //Метод, возвращающий радиус окружности
    public float getRadius() {
        return radius;
    }
    //Метод, устанавливающий радиус окружности
    public void setRadius(float r) {
        radius=r;
    }
}
