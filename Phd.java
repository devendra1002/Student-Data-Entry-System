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

public class Phd extends PostGraduate{
    public String topic,supervisor;
    public void pgPhdFrame() {
        JFrame pgPhdFrame = new JFrame("PhD (Post Graduates)");
        JTextField fileNameTextField,nameTextField,courseTextField,deptTextField,rollNoTextField,topicTextField,
                supervisorTextField,bookTextField,paperTextField,patentTextField;
        JLabel fileLabel,nameLabel,courseLabel,deptLabel,rollLabel,topicLabel,supervisorLabel
                ,bookLabel,paperLabel,patentLabel;
        JButton submitButton;

        pgPhdFrame.setLayout(new FlowLayout(1,80,35));
        pgPhdFrame.setSize(600,700);
        pgPhdFrame.setVisible(true);

        fileLabel = new JLabel("File Name:            ");
        pgPhdFrame.add(fileLabel);
        fileNameTextField = new JTextField(18);
        pgPhdFrame.add(fileNameTextField);

        nameLabel = new JLabel("Name:                   ");
        pgPhdFrame.add(nameLabel);
        nameTextField = new JTextField(18);
        pgPhdFrame.add(nameTextField);

        courseLabel = new JLabel("Course:                ");
        pgPhdFrame.add(courseLabel);
        courseTextField = new JTextField(18);
        pgPhdFrame.add(courseTextField);

        deptLabel = new JLabel("Department:        ");
        pgPhdFrame.add(deptLabel);
        deptTextField = new JTextField(18);
        pgPhdFrame.add(deptTextField);

        rollLabel = new JLabel("Roll Number:      ");
        pgPhdFrame.add(rollLabel);
        rollNoTextField = new JTextField(18);
        pgPhdFrame.add(rollNoTextField);

        bookLabel = new JLabel("Book Published:");
        pgPhdFrame.add(bookLabel);
        bookTextField = new JTextField(18);
        pgPhdFrame.add(bookTextField);

        paperLabel = new JLabel("Paper Published:");
        pgPhdFrame.add(paperLabel);
        paperTextField = new JTextField(18);
        pgPhdFrame.add(paperTextField);

        patentLabel = new JLabel("Patent Done:       ");
        pgPhdFrame.add(patentLabel);
        patentTextField = new JTextField(18);
        pgPhdFrame.add(patentTextField);

        topicLabel = new JLabel("Topic:                  ");
        pgPhdFrame.add(topicLabel);
        topicTextField = new JTextField(18);
        pgPhdFrame.add(topicTextField);

        supervisorLabel = new JLabel("Supervisor:         ");
        pgPhdFrame.add(supervisorLabel);
        supervisorTextField = new JTextField(18);
        pgPhdFrame.add(supervisorTextField);

        submitButton = new JButton("SUBMIT");
        pgPhdFrame.add(submitButton);
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
                topic = topicTextField.getText();
                supervisor = supervisorTextField.getText();
                System.out.println("Full Name      :" + name);
                System.out.println("Course         :" + course);
                System.out.println("Department     :" + dept);
                System.out.println("Roll Number    :" + rollNo);
                System.out.println("Book  Published:" + book);
                System.out.println("Paper Published:" + paper);
                System.out.println("Patent Done    :" + patent);
                System.out.println("Specialization :" + topic);
                System.out.println("Project        :" + supervisor);


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
                System.out.println("Specialization: " + topic);
                System.out.println("Project:        " + supervisor);

                System.setOut(console);
            }
        });
    }
}

