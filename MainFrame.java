package student;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public void mainFrame() {
        JFrame mainFrame = new JFrame("Data Entry System");
        mainFrame.setSize(600,700);
        mainFrame.setVisible(true);
        mainFrame.setLayout(new FlowLayout(1,500,100));

        JButton UG = new JButton("UG");
        UG.setSize(100,50);
        mainFrame.add(UG);

        JButton MASTER = new JButton("MASTER");
        UG.setSize(100,50);
        mainFrame.add(MASTER);

        JButton PhD = new JButton("PhD");
        UG.setSize(100,50);
        mainFrame.add(PhD);

        JButton SCIENTIST = new JButton("SCIENTIST");
        UG.setSize(100,50);
        mainFrame.add(SCIENTIST);
    }


}
