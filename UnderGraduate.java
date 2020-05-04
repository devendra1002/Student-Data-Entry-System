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

class UnderGraduate extends Student{
    public String branch;
    public String college;
    public void ugFrame() {
        JFrame ugFrame = new JFrame("Under Graduates");
        JTextField fileNameTextField,nameTextField,courseTextField,deptTextField,rollNoTextField,branchTextField,collegeTextField;
        JLabel fileLabel,nameLabel,courseLabel,deptLabel,rollLabel,branchLabel,collegeLabel;
        JButton submitButton;

        ugFrame.setLayout(new FlowLayout(1,80,40));
        ugFrame.setSize(500,600);
        ugFrame.setVisible(true);

        fileLabel = new JLabel("File Name:    ");
        ugFrame.add(fileLabel);
        fileNameTextField = new JTextField(18);
        ugFrame.add(fileNameTextField);

        nameLabel = new JLabel("Name:            ");
        ugFrame.add(nameLabel);
        nameTextField = new JTextField(18);
        ugFrame.add(nameTextField);

        courseLabel = new JLabel("Course:         ");
        ugFrame.add(courseLabel);
        courseTextField = new JTextField(18);
        ugFrame.add(courseTextField);

        deptLabel = new JLabel("Department:  ");
        ugFrame.add(deptLabel);
        deptTextField = new JTextField(18);
        ugFrame.add(deptTextField);

        rollLabel = new JLabel("Roll Number: ");
        ugFrame.add(rollLabel);
        rollNoTextField = new JTextField(18);
        ugFrame.add(rollNoTextField);

        branchLabel = new JLabel("Branch:           ");
        ugFrame.add(branchLabel);
        branchTextField = new JTextField(18);
        ugFrame.add(branchTextField);

        collegeLabel = new JLabel("College:           ");
        ugFrame.add(collegeLabel);
        collegeTextField = new JTextField(18);
        ugFrame.add(collegeTextField);

        submitButton = new JButton("SUBMIT");
        ugFrame.add(submitButton);
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
                branch = branchTextField.getText();
                college = collegeTextField.getText();
                System.out.println("Full Name  : " + name);
                System.out.println("Course     : " + course);
                System.out.println("Department : " + dept);
                System.out.println("Roll Number: " + rollNo);
                System.out.println("Branch     : " + branch);
                System.out.println("College    : " + college);

                PrintStream console = System.out;

                File file = new File(fileName+".txt");
                FileOutputStream fos = null;
                try {
                    fos = new FileOutputStream(file);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                PrintStream ps = new PrintStream(fos);
                System.setOut(ps);
                System.out.println("Name       : "+name);
                System.out.println("Course     : "+course);
                System.out.println("Department : "+dept);
                System.out.println("Roll Number: "+rollNo);
                System.out.println("Branch     : " + branch);
                System.out.println("College    : " + college);

                System.setOut(console);
            }
        });
    }
}
