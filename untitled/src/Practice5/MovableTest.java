package Practice5;

public class MovableTest {
    public static void main(String[] args) {
        Movable m = new MovablePoint(0, 0, 3, 3);
        System.out.println("Point:");
        System.out.println(m);
        m.moveUp();
        m.moveLeft();
        System.out.println("Вверх-влево : " + m);

        System.out.println("\nCircle:");
        m = new MovableCircle(0, 0, 3, 5, 4);
        System.out.println(m);
        m.moveDown();
        System.out.println("Вниз : " + m);

        System.out.println("\nRectangle:");
        m = new MovableRectangle(0, 0, 4, 4, 2,2);
        System.out.println(m);
        m.moveRight();
        m.moveDown();
        System.out.println("Вниз-вправо : " + m);

        System.out.println("Изменим скорость для прямоугольника:");
        MovableRectangle r = (MovableRectangle)m;
        r.setSpeed(5, 0);
        if (!r.isCheck()) {
            System.out.println("Тест не прошел. Скорости точек прямоугольника не совпадают!");
        } else {
            r.moveDown();
            System.out.println("Тест прошел успешно.");
        }
    }
}
