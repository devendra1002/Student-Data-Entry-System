package student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Data Entry System");
        mainFrame.setSize(300,400);
        mainFrame.setLayout(new FlowLayout(1,90,50));


        JButton ug, master,phd,scientist;

        ug = new JButton("UNDER GRADUATE");
        ug.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UnderGraduate underGraduate = new UnderGraduate();
                underGraduate.ugFrame();
            }
        });
        mainFrame.add(ug);

        master = new JButton("MASTER");
        master.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Master masterObj = new Master();
                masterObj.pgMasterFrame();
            }
        });
        mainFrame.add(master);

        phd = new JButton("PhD");
        phd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Phd phdObj = new Phd();
                phdObj.pgPhdFrame();
            }
        });
        mainFrame.add(phd);

        scientist = new JButton("SCIENTIST");
        scientist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scientist scObj = new Scientist();
                scObj.pgScientistFrame();
            }
        });
        mainFrame.add(scientist);

        mainFrame.setVisible(true);
    }
}
