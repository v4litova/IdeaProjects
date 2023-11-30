package Practice22.Ex3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public static void main(String[] args) {
        ICreateDocument factory = new CreateTextDocument();
        JFrame jFrame = new JFrame("MenuBarProject");
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem newf = new JMenuItem("New");
        //JMenu newSubMenu = new JMenu("New");

        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        /*JMenuItem text = new JMenuItem("TextFile");
        JMenuItem image = new JMenuItem("ImageFile");
        JMenuItem music = new JMenuItem("MusicFile");*/

        mb.add(file);
        file.add(newf);
        file.add(open);
        file.add(save);
        file.add(exit);


        newSubMenu.add(text);
        newSubMenu.add(image);
        newSubMenu.add(music);

        newf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Выбор типа документа
                int option = JOptionPane.showOptionDialog(null,
                        "Choose document type",
                        "New Document",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        new Object[]{"TextFile", "ImageFile", "MusicFile"},
                        "TextFile");

                IDocument document;
                switch (option) {
                    case 0:
                        document = factory.CreateNew();
                        System.out.println("Created new Text document");
                        break;
                    case 1:
                        // Логика для создания/открытия изображения
                        document = new ImageDocument();
                        System.out.println("Created new Image document");
                        break;
                    case 2:
                        // Логика для создания/открытия музыкального файла
                        document = new MusicDocument();
                        System.out.println("Created new Music document");
                        break;
                    default:
                        document = null;
                        break;
                }

                // Добавлено для демонстрации, вы можете выполнить дополнительные действия с созданным документом
                if (document != null) {
                    System.out.println("Created new document: " + document.getClass().getSimpleName());
                }
            }
        });

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IDocument document = factory.CreateOpen();
                // Добавлено для демонстрации, вы можете выполнить дополнительные действия с открытым документом
                System.out.println("Opened document: " + document.getClass().getSimpleName());
            }
        });

        jFrame.setJMenuBar(mb);
        jFrame.setVisible(true);
    }
}
