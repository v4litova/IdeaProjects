package Practice7;
import javax.swing.*;

public class Practice7 extends JFrame {
    private JPanel panel1;
    private JButton ACMilanButton;
    private JButton realMadridButton;
    private JLabel lastScoreLabel;
    private JLabel resLabel;
    private JLabel winLabel;

    private int mil = 0, rea = 0;//для счета

    private Practice7() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//при закрытии окна, приложение завершит работу
        setSize(550, 100);
        setLocationRelativeTo(null);//окно по центру
        panel1 = new JPanel();
        setContentPane(panel1);

        //создание кнопок и меток
        ACMilanButton = new JButton("AC Milan");
        realMadridButton = new JButton("Real Madrid");
        lastScoreLabel = new JLabel("Last Scorer: N/A");
        resLabel = new JLabel("Result: 0 X 0");
        winLabel = new JLabel("Winner: DRAW");

        //установка компонент на панели
        panel1.add(ACMilanButton);
        panel1.add(realMadridButton);
        panel1.add(lastScoreLabel);
        panel1.add(resLabel);
        panel1.add(winLabel);

        //слушатели событий для кнопок
        ACMilanButton.addActionListener(e -> {
            mil++;
            upd("AC Milan");//обновление меток
        });

        realMadridButton.addActionListener(e -> {
            rea++;
            upd("Real Madrid");
        });

        setVisible(true);//делаем окно видимым
    }

    private void upd(String last) {//метод для обновления счета и победителя
        lastScoreLabel.setText("Last Score: " + last);
        resLabel.setText("Result: " + mil + " X " + rea);
        String w = "DRAW";
        if (mil > rea)
            w = "AC Milan";
        else if (rea > mil)
            w = "Real Madrid";
        winLabel.setText("Winner: " + w);
    }

    public static void main(String[] args) {
        new Practice7();
    }
}

