package Practice8.Ex3;
//Создать окно, реализовать анимацию, с помощью картинки,
//состоящей из нескольких кадров.
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import java.util.Objects;


public class Ex3 extends JFrame {

    private final JLabel imgLabel;
    private int imgNum = 1;

    private Ex3(){
        this.setSize(600, 400);
        imgLabel = new JLabel("", new ImageIcon(Objects.requireNonNull(getClass().getResource("1.png"))), SwingConstants.CENTER);

        getContentPane().add(imgLabel);

        Timer timer = new Timer(100, e -> nextImg());
        timer.start();
    }
    private void nextImg(){
        imgLabel.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource((++imgNum) + ".png"))));
        if(imgNum == 8) imgNum = 0;

    }

    public static void main(String[] args) {
        Ex3 mf = new Ex3();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);

    }
}