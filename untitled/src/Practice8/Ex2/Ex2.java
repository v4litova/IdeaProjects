package Practice8.Ex2;
//Создать окно, отобразить в нем картинку, путь к которой указан в
//аргументах командной строки.
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Ex2 extends JScrollPane {
    private BufferedImage image;

    public Ex2(String imagePath) {
        try {
            // Загрузка изображения из указанного пути
            image = ImageIO.read(new File(imagePath));

            // Создание JPanel для отображения изображения
            JPanel imagePanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(image, 0, 0, this);
                }
            };

            // Установка размеров JPanel с учетом размеров изображения
            imagePanel.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
            // Установка JPanel
            setViewportView(imagePanel);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Пожалуйста, укажите путь к изображению в аргументах командной строки.");
            System.exit(1);
        }

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 400);
            frame.add(new Ex2(args[0]));
            frame.setVisible(true);
        });

    }
}