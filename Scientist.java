package student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Scientist extends PostGraduate {
    public String area;
    public void pgScientistFrame() {
        JFrame pgScientistFrame = new JFrame("Scientist (Post Graduates)");
        JTextField fileNameTextField,nameTextField,courseTextField,deptTextField,rollNoTextField,areaTextField
                ,bookTextField,paperTextField,patentTextField;
        JLabel fileLabel,nameLabel,courseLabel,deptLabel,rollLabel,areaLabel
                ,bookLabel,paperLabel,patentLabel;
        JButton submitButton;

        pgScientistFrame.setLayout(new FlowLayout(1,80,35));
        pgScientistFrame.setSize(600,700);
        pgScientistFrame.setVisible(true);

        fileLabel = new JLabel("File Name:            ");
        pgScientistFrame.add(fileLabel);
        fileNameTextField = new JTextField(18);
        pgScientistFrame.add(fileNameTextField);

        nameLabel = new JLabel("Name:                   ");
        pgScientistFrame.add(nameLabel);
        nameTextField = new JTextField(18);
        pgScientistFrame.add(nameTextField);

        courseLabel = new JLabel("Course:                ");
        pgScientistFrame.add(courseLabel);
        courseTextField = new JTextField(18);
        pgScientistFrame.add(courseTextField);

        deptLabel = new JLabel("Department:        ");
        pgScientistFrame.add(deptLabel);
        deptTextField = new JTextField(18);
        pgScientistFrame.add(deptTextField);

        rollLabel = new JLabel("Roll Number:      ");
        pgScientistFrame.add(rollLabel);
        rollNoTextField = new JTextField(18);
        pgScientistFrame.add(rollNoTextField);

        bookLabel = new JLabel("Book Published:");
        pgScientistFrame.add(bookLabel);
        bookTextField = new JTextField(18);
        pgScientistFrame.add(bookTextField);

        paperLabel = new JLabel("Paper Published:");
        pgScientistFrame.add(paperLabel);
        paperTextField = new JTextField(18);
        pgScientistFrame.add(paperTextField);

        patentLabel = new JLabel("Patent Done:       ");
        pgScientistFrame.add(patentLabel);
        patentTextField = new JTextField(18);
        pgScientistFrame.add(patentTextField);

        areaLabel = new JLabel("Study Area:         ");
        pgScientistFrame.add(areaLabel);
        areaTextField = new JTextField(18);
        pgScientistFrame.add(areaTextField);

        submitButton = new JButton("SUBMIT");
        pgScientistFrame.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileName = fileNameTextField.getText();
                name = nameTextField.getText();
                dept = deptTextField.getText();
                course = courseTextField.getText();
                String rollVar;
                rollVar = rollNoTextField.getText().toString();
                rollNo = Integer.parseInt(rollVar);
                book = bookTextField.getText();
                paper = paperTextField.getText();
                patent = patentTextField.getText();
                area = areaTextField.getText();
                System.out.println("Full Name       :" + name);
                System.out.println("Course          :" + course);
                System.out.println("Department      :" + dept);
                System.out.println("Roll Number     :" + rollNo);
                System.out.println("Book  Published :" + book);
                System.out.println("Paper Published :" + paper);
                System.out.println("Patent Done     :" + patent);
                System.out.println("Study Area      :" + area);


                PrintStream console = System.out;

                File file = new File(fileName + ".txt");
                FileOutputStream fos = null;
                try {
                    fos = new FileOutputStream(file);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                PrintStream ps = new PrintStream(fos);
                System.setOut(ps);
                System.out.println("Name       : " + name);
                System.out.println("Course     : " + course);
                System.out.println("Department : " + dept);
                System.out.println("Roll Number: " + rollNo);
                System.out.println("Book  Published:" + book);
                System.out.println("Paper Published:" + paper);
                System.out.println("Patent Done:    " + patent);
                System.out.println("Study Area:     " + area);

                System.setOut(console);
            }
        });
    }
}
