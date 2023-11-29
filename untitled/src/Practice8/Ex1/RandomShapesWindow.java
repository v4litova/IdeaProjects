package Practice8.Ex1;
//Создать окно, нарисовать в нем 20 случайных фигур, случайного
//цвета. Классы фигур должны наследоваться от абстрактного класса Shape, в
//котором описаны свойства фигуры: цвет, позиция.
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomShapesWindow extends JFrame {
    private List<Practice8.Ex1.Shape> shapes;

    private RandomShapesWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        shapes = generateRandomShapes(20); // Генерируем фигуры после отображения окна
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Practice8.Ex1.Shape shape : shapes) {
            shape.draw(g);
        }
    }

    private List<Practice8.Ex1.Shape> generateRandomShapes(int count) {
        List<Shape> randomShapes = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            int shapeType = rand.nextInt(3); // Выбираем случайный тип фигуры (0 - круг, 1 - прямоугольник, 2 - треугольник)
            Color randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)); // Случайный цвет
            int x = rand.nextInt(getWidth() - 50); // Случайная позиция по X с учетом размера фигуры
            int y = rand.nextInt(getHeight() - 50); // Случайная позиция по Y с учетом размера фигуры

            switch (shapeType) {
                case 0:
                    int radius = rand.nextInt(50) + 10; // Случайный радиус от 10 до 59
                    randomShapes.add(new Circle(randomColor, x, y, radius));
                    break;
                case 1:
                    int width = rand.nextInt(80) + 20; // Случайная ширина от 20 до 99
                    int height = rand.nextInt(80) + 20; // Случайная высота от 20 до 99
                    randomShapes.add(new Rectangle(randomColor, x, y, width, height));
                    break;
                case 2:
                    int[] xPoints = {x, x + rand.nextInt(50), x - rand.nextInt(50)}; // Три случайные точки по X
                    int[] yPoints = {y, y + rand.nextInt(50), y + rand.nextInt(50)}; // Три случайные точки по Y
                    randomShapes.add(new Triangle(randomColor, xPoints, yPoints));
                    break;
            }
        }

        return randomShapes;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RandomShapesWindow());
    }
}