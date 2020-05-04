# Student-Data-Entry-System

# Description:
Student data entry system is an application software which can be used to store the data of students pursuing Under Graduates (Bachelor) and Post Graduates (Masters, PhD, Scientist) in automatically generated .txt file. After entering all details such as name, roll no, course, branch, college etc. in different text fields of Graphical user interface window for all students belong to different streams will be extracted from each GUI window and can be stored in a file.

# Implementation:
Implemented using Java programming language only.

# Files Description:
- MainClass.Java:
  Classes UnderGraduates, Master, Phd and Scientist are instantiated here.

- UnderGraduate.Java:
  This is child class of class Student (i.e. it extends Student class).

- PostGraduate.Java:
  This is another child class of class Student (i.e. it also extends Student class).
  
- Master.Java, Phd.Java and Scientist.Java:
  All these classes are child class of PostGraduate class (i.e. all these classes extends PostGraduate class).
  Multilevel Inheritance carried out here.
  
- DataEntrySystemGuiBased.jar: 
  This is executable file which is created using MainClass.java file.
  File with extension (.jar) can be used to run the complete software without an IDE.

# Concepts covered and Requirements:
- Encapsulation
- Inheritance
- Access Specifiers
- Package
- GUI programming
