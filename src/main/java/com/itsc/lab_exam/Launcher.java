package com.itsc.lab_exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    StudentRepo studentRepo = (StudentRepo) context.getBean("studentRepo");

    // Create database and table
    studentRepo.createDBAndTable();

    // Insert a student record
    Student student = new Student(1, "Nathnael Teshome", "nathnael.teshome@gmail.com");
    studentRepo.insertIntoTable(student);

    // pirnt the stundent name fromthe data base
    System.out.println(student.getName() + " is successfully logged to the database");

  }
}
