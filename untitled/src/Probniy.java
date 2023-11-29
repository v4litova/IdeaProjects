import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Probniy extends JFrame {
    private JPanel panel1;
    private JButton ACMilanButton;
    private JButton realMadridButton;
    private JLabel winLabel;
    private JLabel resLabel;
    private JLabel lastScoreLabel;

    private int mil = 0, rea = 0;
    private String lastScorer = "N/A";

    private Probniy() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        setContentPane(panel1);

        winLabel = new JLabel("Winner: DRAW");
        resLabel = new JLabel("Result: 0 X 0");
        lastScoreLabel = new JLabel("Last Scorer: N/A");

        ACMilanButton = new JButton("AC Milan");
        realMadridButton = new JButton("Real Madrid");

        ACMilanButton.addActionListener(e -> {
            mil++;
            lastScorer = "AC Milan";
            updateLabels();
        });

        realMadridButton.addActionListener(e -> {
            rea++;
            lastScorer = "Real Madrid";
            updateLabels();
        });

        panel1.add(winLabel);
        panel1.add(resLabel);
        panel1.add(lastScoreLabel);
        panel1.add(ACMilanButton);
        panel1.add(realMadridButton);

        setVisible(true);
    }

    private void updateLabels() {
        resLabel.setText("Result: " + mil + " X " + rea);
        String winner = mil > rea ? "AC Milan" : (rea > mil ? "Real Madrid" : "DRAW");
        winLabel.setText("Winner: " + winner);
        lastScoreLabel.setText("Last Scorer: " + lastScorer);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Probniy());
    }
}
