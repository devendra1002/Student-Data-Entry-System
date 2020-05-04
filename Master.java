package student;

import student.PostGraduate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Master extends PostGraduate {
    public String specialization;
    public String project;
    public void pgMasterFrame() {
        JFrame pgMasterFrame = new JFrame("Master (Post Graduates)");
        JTextField fileNameTextField,nameTextField,courseTextField,deptTextField,rollNoTextField,specializationTextField,
                projectTextField,bookTextField,paperTextField,patentTextField;
        JLabel fileLabel,nameLabel,courseLabel,deptLabel,rollLabel,specializationLabel,projectLabel
                ,bookLabel,paperLabel,patentLabel;
        JButton submitButton;

        pgMasterFrame.setLayout(new FlowLayout(1,80,35));
        pgMasterFrame.setSize(600,700);
        pgMasterFrame.setVisible(true);

        fileLabel = new JLabel("File Name:            ");
        pgMasterFrame.add(fileLabel);
        fileNameTextField = new JTextField(18);
        pgMasterFrame.add(fileNameTextField);

        nameLabel = new JLabel("Name:                   ");
        pgMasterFrame.add(nameLabel);
        nameTextField = new JTextField(18);
        pgMasterFrame.add(nameTextField);

        courseLabel = new JLabel("Course:                ");
        pgMasterFrame.add(courseLabel);
        courseTextField = new JTextField(18);
        pgMasterFrame.add(courseTextField);

        deptLabel = new JLabel("Department:        ");
        pgMasterFrame.add(deptLabel);
        deptTextField = new JTextField(18);
        pgMasterFrame.add(deptTextField);

        rollLabel = new JLabel("Roll Number:      ");
        pgMasterFrame.add(rollLabel);
        rollNoTextField = new JTextField(18);
        pgMasterFrame.add(rollNoTextField);

        bookLabel = new JLabel("Book Published:");
        pgMasterFrame.add(bookLabel);
        bookTextField = new JTextField(18);
        pgMasterFrame.add(bookTextField);

        paperLabel = new JLabel("Paper Published:");
        pgMasterFrame.add(paperLabel);
        paperTextField = new JTextField(18);
        pgMasterFrame.add(paperTextField);

        patentLabel = new JLabel("Patent Done:       ");
        pgMasterFrame.add(patentLabel);
        patentTextField = new JTextField(18);
        pgMasterFrame.add(patentTextField);

        specializationLabel = new JLabel("Specialization:    ");
        pgMasterFrame.add(specializationLabel);
        specializationTextField = new JTextField(18);
        pgMasterFrame.add(specializationTextField);

        projectLabel = new JLabel("Project:                ");
        pgMasterFrame.add(projectLabel);
        projectTextField = new JTextField(18);
        pgMasterFrame.add(projectTextField);

        submitButton = new JButton("SUBMIT");
        pgMasterFrame.add(submitButton);
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
                specialization = specializationTextField.getText();
                project = projectTextField.getText();
                System.out.println("Full Name       :" + name);
                System.out.println("Course          :" + course);
                System.out.println("Department      :" + dept);
                System.out.println("Roll Number     :" + rollNo);
                System.out.println("Book  Published :" + book);
                System.out.println("Paper Published :" + paper);
                System.out.println("Patent Done     :" + patent);
                System.out.println("Specialization  :" + specialization);
                System.out.println("Project         :" + project);


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
                System.out.println("Specialization: " + specialization);
                System.out.println("Project:        " + project);

                System.setOut(console);
            }
        });
    }
}

